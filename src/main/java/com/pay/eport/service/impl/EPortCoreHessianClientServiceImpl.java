package com.pay.eport.service.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.eport.constants.EPortHessianResponseConstant;
import com.pay.eport.dto.EPortOrderQueryDto;
import com.pay.eport.dto.EPortOrderUpdateItem;
import com.pay.eport.model.TEportOrder;
import com.pay.fi.commons.eport.EPortOrderUpdateTypeEnum;
import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.enums.SerCode;
import com.pay.inf.enums.SystemCodeEnum;
import com.pay.inf.params.HessianInvokeResponse;
import com.pay.inf.service.AbstractHessianClientService;
import com.pay.util.DateUtil;
import com.pay.util.JSonUtil;
import com.pay.util.MapUtils;

public class EPortCoreHessianClientServiceImpl extends AbstractHessianClientService
{
	private static final Log logger = LogFactory.getLog( EPortCoreHessianClientServiceImpl.class );

	// 报关订单状态变更参数
	private static final String PARAM_UPDATE_TYPE = "updateType";
	private static final String PARAM_UPDATE_ORDER_LIST = "eportOrderList";

	public EPortCoreHessianClientServiceImpl( )
	{
		super( SystemCodeEnum.PRE, SystemCodeEnum.EPORTCORE );
	}

	public List< TEportOrder > queryOrder( EPortOrderQueryDto queryDto )
	{
		if ( queryDto == null )
		{
			return Collections.emptyList( );
		}

		String response = this.invoke( SerCode.EPORTCORE_ORDER_QUERY,
				MapUtils.objectToMap( queryDto ) );

		return parseQueryResponse( response );
	}

	@SuppressWarnings( "unchecked" )
	private static List< TEportOrder > parseQueryResponse( String response )
	{
		if ( StringUtils.isBlank( response ) )
		{
			return Collections.emptyList( );
		}

		JSONObject jsonObject = JSONObject.fromObject( response );
		if ( jsonObject == null )
		{
			return Collections.emptyList( );
		}

		if ( !ResponseCodeEnum.SUCCESS.getCode( ).equals(
				jsonObject.optString( EPortHessianResponseConstant.KEY_RESPONSE_CODE ) ) )
		{
			logger.error( "电子口岸---报关订单查询失败："
					+ jsonObject.optString( EPortHessianResponseConstant.KEY_RESPONSE_DESC, "" ) );

			return Collections.emptyList( );
		}

		JSONArray orderArray = jsonObject
				.optJSONArray( EPortHessianResponseConstant.KEY_EPORT_ORDERS );
		if ( orderArray == null || orderArray.size( ) == 0 )
		{
			return Collections.emptyList( );
		}

		JSONUtils.getMorpherRegistry( ).registerMorpher(
				new DateMorpher( new String[ ] { DateUtil.DEFAULT_DATE_FROMAT } ) );
		return JSONArray.toList( orderArray, TEportOrder.class );
	}

	public boolean notifyOrderStatusUpdate( List< EPortOrderUpdateItem > updateOrderList )
	{
		if ( updateOrderList == null || updateOrderList.isEmpty( ) )
		{
			return true;
		}

		String result = this.invoke( SerCode.EPORTCORE_ORDER_STATUS_CHANGE,
				createOrderStatusUpdateRequest( updateOrderList ) );

		if ( StringUtils.isBlank( result ) )
		{
			return false;
		}

		HessianInvokeResponse response = JSonUtil.toObject( result, HessianInvokeResponse.class );
		return ResponseCodeEnum.SUCCESS.getCode( ).equals( response.getResponseCode( ) );
	}

	private static Map< String, Object > createOrderStatusUpdateRequest(
			List< EPortOrderUpdateItem > updateOrderList )
	{
		HashMap< String, Object > paramMap = new HashMap< String, Object >( 3 );
		paramMap.put( PARAM_UPDATE_TYPE, EPortOrderUpdateTypeEnum.NOTIFICATION.getCode( ) );
		paramMap.put( PARAM_UPDATE_ORDER_LIST, JSonUtil.toJSonString( updateOrderList ) );

		return paramMap;
	}
}