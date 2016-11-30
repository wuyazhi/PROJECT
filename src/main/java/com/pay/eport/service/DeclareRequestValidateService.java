package com.pay.eport.service;

import com.pay.eport.dto.EPortDeclareRequestDto;
import com.pay.eport.hessian.EPortDeclareHessianResponse;

public interface DeclareRequestValidateService
{
	public EPortDeclareHessianResponse validate( EPortDeclareRequestDto declareRequestDto );
}