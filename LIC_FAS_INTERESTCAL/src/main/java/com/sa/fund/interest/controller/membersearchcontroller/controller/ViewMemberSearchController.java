package com.sa.fund.interest.controller.membersearchcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.fund.interest.controller.membersearchcontroller.model.ViewMemberSearchControllerModel;
import com.sa.fund.interest.controller.membersearchcontroller.service.ViewMemberSearchControllerService;

@RestController
@RequestMapping("/member/search")
public class ViewMemberSearchController {
	
	@Autowired
	private ViewMemberSearchControllerService viewMemberSearchControllerService;
	
	@GetMapping
	public ResponseEntity<Object> getAccountDetails(@RequestParam String payload){
		ViewMemberSearchControllerModel viewMemberSearchControllerModel = new ViewMemberSearchControllerModel(payload,null,false);
		
		if(viewMemberSearchControllerService.checkIfRecordsExist()) {
			viewMemberSearchControllerModel.setResponse(viewMemberSearchControllerService.getAccountDetails(payload));
			viewMemberSearchControllerModel.setRecordExist(true);
			return viewMemberSearchControllerModel.getResponse();
		}
		
		viewMemberSearchControllerModel.setResponse(viewMemberSearchControllerService.responseNoRecordsFound());
		return viewMemberSearchControllerModel.getResponse();
	}

}