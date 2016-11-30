package com.pay.eport.service;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.pay.eport.dto.EPortDeclareRequestDto;
import com.pay.eport.enums.DeclareResultEnum;
import com.pay.eport.enums.PaperTypeEnum;
import com.pay.eport.hessian.EPortDeclareHessianResponse;
import com.pay.fi.commons.EportCodeEnum;
import com.pay.inf.enums.ResponseCodeEnum;

public abstract class AbstractDeclareRequestValidateService implements
		DeclareRequestValidateService
{
	protected static final String TEMPLATE_ERROR_WRONG_EPORT_CITY = "这不是一个发往%1s电子口岸的报关请求。请求电子口岸城市是: %2s";
	protected static final String TEMPLATE_ERROR_NO_MERCHANT = "没有会员号是（%1s）的商户";

	private static final String VALIDATE_REGEX_MEMBER_CODE = "[0-9]{1,60}";

	protected AbstractDeclareRequestValidateService( )
	{}

	@Override
	public EPortDeclareHessianResponse validate( EPortDeclareRequestDto declareRequestDto )
	{
		String errorMessage = validateMustField( declareRequestDto );
		if ( StringUtils.isNotEmpty( errorMessage ) )
		{
			return createValidateFailedResponse( errorMessage, declareRequestDto.getEportCode( ) );
		}

		errorMessage = this.validateOptionalField( declareRequestDto );
		if ( StringUtils.isNotEmpty( errorMessage ) )
		{
			return createValidateFailedResponse( errorMessage, declareRequestDto.getEportCode( ) );
		}

		errorMessage = this.validateRequestEportCode( declareRequestDto );
		if ( StringUtils.isNotEmpty( errorMessage ) )
		{
			return createValidateFailedResponse( errorMessage, declareRequestDto.getEportCode( ) );
		}

		errorMessage = this.validateParameterValues( declareRequestDto );
		if ( StringUtils.isNotEmpty( errorMessage ) )
		{
			return createValidateFailedResponse( errorMessage, declareRequestDto.getEportCode( ) );
		}

		return null;
	}

	private final String validateRequestEportCode( EPortDeclareRequestDto declareRequestDto )
	{
		final EportCodeEnum eportCode = this.getEportCode( );
		if ( eportCode != null && !eportCode.getCode( ).equals( declareRequestDto.getEportCode( ) ) )
		{
			return String.format( TEMPLATE_ERROR_WRONG_EPORT_CITY, eportCode.getCityName( ),
					EportCodeEnum.getCityNameFromCode( declareRequestDto.getEportCode( ) ) );
		}

		return null;
	}

	protected abstract EportCodeEnum getEportCode( );

	/**
	 * 电子口岸报关---根据各个电子口岸实际情况对请求参数的选填字段进行校验
	 * 
	 * @param declareRequestDto
	 * @return
	 */
	protected String validateOptionalField( EPortDeclareRequestDto declareRequestDto )
	{
		return null;
	}

	/**
	 * 根据各电子口岸实际需要进行参数值校验
	 * 
	 * @param declareRequestDto
	 * @return
	 */
	protected String validateParameterValues( EPortDeclareRequestDto declareRequestDto )
	{
		return null;
	}

	/**
	 * 电子口岸报关---请求参数必填字段校验
	 * 
	 * @param declareRequestDto
	 * @return
	 */
	private static String validateMustField( EPortDeclareRequestDto declareRequestDto )
	{
		String memberCode = declareRequestDto.getPayMerchantCode( );
		if ( StringUtils.isBlank( memberCode ) )
		{
			return "支付商户会员号为空";
		}
		else if ( !Pattern.matches( VALIDATE_REGEX_MEMBER_CODE, memberCode ) )
		{
			return "支付商户会员号仅限数字组成，长度不超过60位";
		}

		if ( StringUtils.isBlank( declareRequestDto.getPayMerchantName( ) ) )
		{
			return "支付商户名称为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getEportCode( ) ) )
		{
			return "电子口岸代码为空";
		}
		else if ( !EportCodeEnum.isExist( declareRequestDto.getEportCode( ) ) )
		{
			return "暂不支持此电子口岸城市代码: " + declareRequestDto.getEportCode( );
		}

		if ( StringUtils.isBlank( declareRequestDto.getEportOrderNo( ) ) )
		{
			return "报关订单号为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.geteCompanyCode( ) ) )
		{
			return "电商平台备案号为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.geteCompanyName( ) ) )
		{
			return "电商平台备案名称为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getOrderNo( ) ) )
		{
			return "商户支付订单编号为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getPayTransactionNo( ) ) )
		{
			return "支付交易号为空";
		}

		String payAmountString = declareRequestDto.getPayAmount( );
		if ( StringUtils.isBlank( payAmountString ) )
		{
			return "支付金额为空";
		}
		else if ( !StringUtils.isNumeric( payAmountString ) )
		{
			return "支付金额值只允许数字";
		}

		String value = declareRequestDto.getPayGoodsAmount( );
		long goodsAmount = 0;
		if ( StringUtils.isNotEmpty( value ) && StringUtils.isNumeric( value ) )
		{
			goodsAmount = Long.parseLong( value );
		}

		value = declareRequestDto.getPayTaxAmount( );
		long taxAmount = 0;
		if ( StringUtils.isNotEmpty( value ) && StringUtils.isNumeric( value ) )
		{
			taxAmount = Long.parseLong( value );
		}

		value = declareRequestDto.getPayFeeAmount( );
		long feeAmount = 0;
		if ( StringUtils.isNotEmpty( value ) && StringUtils.isNumeric( value ) )
		{
			feeAmount = Long.parseLong( value );
		}

		// 当货款、税款、运费金额都大于0时（说明参数已传入），须满足条件：支付金额=货款+税款+运费
		if ( goodsAmount > 0 && taxAmount > 0 && feeAmount > 0
				&& Long.parseLong( payAmountString ) != ( goodsAmount + taxAmount + feeAmount ) )
		{
			return "支付金额、货款、税款、运费金额须满足：支付金额=货款+税款+运费";
		}

		if ( StringUtils.isBlank( declareRequestDto.getPayTimeStr( ) ) )
		{
			return "支付时间为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getCurrCode( ) ) )
		{
			return "支付币种为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getPayerName( ) ) )
		{
			return "支付人姓名为空";
		}

		if ( StringUtils.isBlank( declareRequestDto.getPaperType( ) ) )
		{
			return "支付人证件类型为空";
		}
		else if ( !PaperTypeEnum.isSupported( declareRequestDto.getPaperType( ) ) )
		{
			return "无效的证件类型代码: " + declareRequestDto.getPaperType( );
		}

		if ( StringUtils.isBlank( declareRequestDto.getPaperNumber( ) ) )
		{
			return "支付人证件号码为空";
		}

		return null;
	}

	private static EPortDeclareHessianResponse createValidateFailedResponse( String errorMessage,
			String ePortOrderNo )
	{
		return new EPortDeclareHessianResponse.Builder( ResponseCodeEnum.INVALID_PARAMETER )
				.setOrderNo( ePortOrderNo ).setResult( DeclareResultEnum.UNACCEPTTED )
				.setFailInfo( errorMessage ).create( );
	}
}