package com.pay.eport.hessian;

import org.apache.commons.lang.StringUtils;

import com.pay.eport.enums.DeclareResultEnum;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.params.HessianInvokeResponse;

public final class EPortDeclareHessianResponse extends HessianInvokeResponse
{
	/** 报关订单号 */
	private String orderNo;

	/** 新生在电子口岸的企业备案号 */
	private String payCompanyCode;

	/** 报关流水号 */
	private String businessNo;

	/** 报关结果 */
	private String result;

	/** 失败信息 */
	private String failInfo;

	private EPortDeclareHessianResponse( )
	{}

	private EPortDeclareHessianResponse( ResponseCodeEnum responseCode )
	{
		super( responseCode.getCode( ), responseCode.getDesc( ) );
	}

	public void setResponseCode( ResponseCodeEnum responseCode )
	{
		if ( responseCode != null )
		{
			this.setResponseCode( responseCode.getCode( ) );
			this.setResponseDesc( responseCode.getDesc( ) );
		}
	}

	public String getOrderNo( )
	{
		return StringUtils.trimToEmpty( this.orderNo );
	}

	public void setOrderNo( String orderNo )
	{
		this.orderNo = orderNo;
	}

	public String getPayCompanyCode( )
	{
		return StringUtils.trimToEmpty( this.payCompanyCode );
	}

	public void setPayCompanyCode( String payCompanyCode )
	{
		this.payCompanyCode = payCompanyCode;
	}

	public String getBusinessNo( )
	{
		return StringUtils.trimToEmpty( this.businessNo );
	}

	public void setBusinessNo( String businessNo )
	{
		this.businessNo = businessNo;
	}

	public String getResult( )
	{
		return StringUtils.trimToEmpty( this.result );
	}

	public void setResult( String result )
	{
		this.result = result;
	}

	public void setResult( DeclareResultEnum declareResult )
	{
		if ( declareResult != null )
		{
			this.setResult( declareResult.getCode( ) );
		}
	}

	public String getFailInfo( )
	{
		return StringUtils.trimToEmpty( this.failInfo );
	}

	public void setFailInfo( String failInfo )
	{
		this.failInfo = failInfo;
	}

	public static EPortDeclareHessianResponse createErrorResponse( ResponseCodeEnum responseCode,
			String failInfo, String payCompanyCode, String ePortOrderNo, String businessNo )
	{
		EPortDeclareHessianResponse response = new EPortDeclareHessianResponse( responseCode );

		response.setResult( DeclareResultEnum.FAILED );
		if ( StringUtils.isNotEmpty( failInfo ) )
		{
			response.setFailInfo( failInfo );
		}
		response.setPayCompanyCode( payCompanyCode );
		response.setOrderNo( ePortOrderNo );
		response.setBusinessNo( businessNo );

		return response;
	}

	public static final class Builder
	{
		private final EPortDeclareHessianResponse response;

		public Builder( )
		{
			this.response = new EPortDeclareHessianResponse( );
		}

		public Builder( ResponseCodeEnum responseCode )
		{
			this.response = new EPortDeclareHessianResponse( responseCode );
		}

		public Builder setResponseCode( ResponseCodeEnum responseCode )
		{
			if ( responseCode != null )
			{
				this.response.setResponseCode( responseCode.getCode( ) );
				this.response.setResponseDesc( responseCode.getDesc( ) );
			}

			return this;
		}

		public Builder setOrderNo( String orderNo )
		{
			this.response.setOrderNo( orderNo );
			return this;
		}

		public Builder setPayCompanyCode( String payCompanyCode )
		{
			this.response.setPayCompanyCode( payCompanyCode );
			return this;
		}

		public Builder setBusinessNo( String businessNo )
		{
			this.response.setBusinessNo( businessNo );
			return this;
		}

		public Builder setResult( String result )
		{
			this.response.setResult( result );
			return this;
		}

		public Builder setResult( DeclareResultEnum declareResult )
		{
			this.response.setResult( declareResult );
			return this;
		}

		public Builder setFailInfo( String failInfo )
		{
			this.response.setFailInfo( failInfo );
			return this;
		}

		public EPortDeclareHessianResponse create( )
		{
			return this.response;
		}
	}
}