package com.sa.fund.interest.integration.supportcontroller.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.interest.integration.supportcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.exception.ApplicationException;
import com.sa.fund.interest.integration.supportcontroller.exception.RequiredFieldException;
import com.sa.fund.interest.integration.supportcontroller.repository.ProcessPolicyMemberByServiceId_SupportControllerRepository;

@Service
public class ProcessPolicyMemberByServiceId_SupportControllerService {
	
	@Autowired
	private ProcessPolicyMemberByServiceId_SupportControllerRepository repository;
	
	public CommonResponseDto<Map<String, String>> processMemberFundByPolicy(Long serviceId) throws RequiredFieldException, ApplicationException {
		return repository.processMemberFundByPolicy(serviceId);
	}
	
}