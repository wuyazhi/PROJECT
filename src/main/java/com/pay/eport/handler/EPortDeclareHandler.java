package com.pay.eport.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.eport.dto.EPortDeclareRequestDto;
import com.pay.eport.hessian.EPortDeclareHessianResponse;
import com.pay.eport.service.EPortDeclareService;
import com.pay.fi.commons.EportCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.util.JSonUtil;

public class EPortDeclareHandler implements EventHandler
{
	private static final Log logger = LogFactory.getLog( EPortDeclareHandler.class );

	private EPortDeclareService ePortDeclareService;

	public EPortDeclareHandler( )
	{}

	public void setePortDeclareService( EPortDeclareService ePortDeclareService )
	{
		this.ePortDeclareService = ePortDeclareService;
	}

	@Override
	public String handle( String dataMsg ) throws HessianInvokeException
	{
		if ( logger.isInfoEnabled( ) )
		{
			logger.info( "电子口岸申报---请求参数: " + dataMsg );
		}

		EPortDeclareRequestDto declareRequestDto = JSonUtil.toObject( dataMsg,
				EPortDeclareRequestDto.class );

		if ( logger.isInfoEnabled( ) )
		{
			logger.info( "电子口岸申报---口岸城市名称: "
					+ EportCodeEnum.getCityNameFromCode( declareRequestDto.getEportCode( ) ) );
		}

		EPortDeclareHessianResponse response = this.ePortDeclareService
				.handleDeclareRequest( declareRequestDto );
		String result = response.toJson( );
		if ( logger.isInfoEnabled( ) )
		{
			logger.info( "电子口岸报申报---处理结果: " + result );
		}

		return result;
	}
}