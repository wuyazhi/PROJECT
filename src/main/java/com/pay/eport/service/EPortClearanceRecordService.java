package com.pay.eport.service;

import java.util.List;

import com.pay.eport.model.EPortClearanceReponse;
import com.pay.eport.model.EPortClearanceRequest;

public interface EPortClearanceRecordService
{
	public void saveRequest( EPortClearanceRequest requestRecord );

	public void saveResponse( EPortClearanceReponse responseRecord );

	public void saveResponse( List< EPortClearanceReponse > responseRecordList );
}