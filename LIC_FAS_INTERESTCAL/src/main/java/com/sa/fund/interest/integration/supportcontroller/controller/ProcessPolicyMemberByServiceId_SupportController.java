package com.sa.fund.interest.integration.supportcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.integration.supportcontroller.dto.CommonResponseDto;
import com.sa.fund.interest.integration.supportcontroller.exception.ApplicationException;
import com.sa.fund.interest.integration.supportcontroller.exception.RequiredFieldException;
import com.sa.fund.interest.integration.supportcontroller.service.ProcessPolicyMemberByServiceId_SupportControllerService;

@RestController
@RequestMapping("/process-policy-member-service-id")
public class ProcessPolicyMemberByServiceId_SupportController {

	@Autowired
	private ProcessPolicyMemberByServiceId_SupportControllerService service;
	
	@GetMapping("/{serviceId}")
	public ResponseEntity<CommonResponseDto<Map<String, String>>> processMemberFundByPolicy(@PathVariable("serviceId") Long serviceId) throws RequiredFieldException, ApplicationException {
		CommonResponseDto<Map<String, String>> responseDto = service.processMemberFundByPolicy(serviceId);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
	}
	
}