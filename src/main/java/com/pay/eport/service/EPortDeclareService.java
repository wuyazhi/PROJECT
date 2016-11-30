package com.pay.eport.service;

import com.pay.eport.dto.EPortDeclareRequestDto;
import com.pay.eport.hessian.EPortDeclareHessianResponse;

public interface EPortDeclareService
{
	public EPortDeclareHessianResponse handleDeclareRequest(
			EPortDeclareRequestDto declareRequestDto );
}