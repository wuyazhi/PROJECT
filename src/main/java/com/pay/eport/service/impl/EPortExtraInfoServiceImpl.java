package com.pay.eport.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.eport.model.EPortExtraInfo;
import com.pay.eport.service.EPortExtraInfoService;
import com.pay.inf.dao.BaseDAO;

public class EPortExtraInfoServiceImpl implements EPortExtraInfoService
{
	private static final Log logger = LogFactory.getLog( EPortExtraInfoServiceImpl.class );

	private BaseDAO< EPortExtraInfo > ePortExtraInfoDao;

	public EPortExtraInfoServiceImpl( )
	{}

	public void setePortExtraInfoDao( BaseDAO< EPortExtraInfo > ePortExtraInfoDao )
	{
		this.ePortExtraInfoDao = ePortExtraInfoDao;
	}

	@Override
	public void saveEPortOrderExtraInfo( EPortExtraInfo extraInfo )
	{
		if ( extraInfo == null )
		{
			return;
		}

		try
		{
			this.ePortExtraInfoDao.create( extraInfo );
		}
		catch ( Exception e )
		{
			logger.error( "电子口岸报关---报关拓展信息异常", e );
		}
	}
}