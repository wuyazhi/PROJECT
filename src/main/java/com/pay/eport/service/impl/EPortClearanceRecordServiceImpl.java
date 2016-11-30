package com.pay.eport.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.eport.model.EPortClearanceReponse;
import com.pay.eport.model.EPortClearanceRequest;
import com.pay.eport.service.EPortClearanceRecordService;
import com.pay.inf.dao.BaseDAO;

public class EPortClearanceRecordServiceImpl implements EPortClearanceRecordService
{
	private static final Log logger = LogFactory.getLog( EPortClearanceRecordServiceImpl.class );

	private BaseDAO< EPortClearanceRequest > requestDao;

	private BaseDAO< EPortClearanceReponse > responseDao;

	public EPortClearanceRecordServiceImpl( )
	{}

	public void setRequestDao( BaseDAO< EPortClearanceRequest > requestDao )
	{
		this.requestDao = requestDao;
	}

	public void setResponseDao( BaseDAO< EPortClearanceReponse > responseDao )
	{
		this.responseDao = responseDao;
	}

	@Override
	public void saveRequest( EPortClearanceRequest requestRecord )
	{
		if ( requestRecord == null )
		{
			return;
		}

		try
		{
			this.requestDao.create( requestRecord );
		}
		catch ( Exception e )
		{
			logger.error( "电子口岸报关---保存请求信息异常", e );
		}
	}

	@Override
	public void saveResponse( EPortClearanceReponse responseRecord )
	{
		if ( responseRecord == null )
		{
			return;
		}

		try
		{
			this.responseDao.create( responseRecord );
		}
		catch ( Exception e )
		{
			logger.error( "电子口岸报关---保存响应信息异常", e );
		}
	}

	@Override
	public void saveResponse( List< EPortClearanceReponse > responseRecordList )
	{
		if ( responseRecordList == null || responseRecordList.isEmpty( ) )
		{
			return;
		}

		try
		{
			this.responseDao.batchCreate( responseRecordList );
		}
		catch ( Exception e )
		{
			logger.error( "电子口岸报关---批量保存响应信息异常", e );
		}
	}
}