package com.pay.eport.service;

import com.pay.eport.model.EPortClearanceReponse;
import com.pay.eport.model.EPortClearanceRequest;

public abstract class AbstractEPortDeclareService implements EPortDeclareService
{
	private EPortClearanceRecordService ePortRecordService;

	public AbstractEPortDeclareService( )
	{}

	public final void setePortRecordService( EPortClearanceRecordService ePortRecordService )
	{
		this.ePortRecordService = ePortRecordService;
	}

	protected final void saveClearanceRequest( EPortClearanceRequest requestRecord )
	{
		this.ePortRecordService.saveRequest( requestRecord );
	}

	protected final void saveClearanceResponse( EPortClearanceReponse responseRecord )
	{
		this.ePortRecordService.saveResponse( responseRecord );
	}
}