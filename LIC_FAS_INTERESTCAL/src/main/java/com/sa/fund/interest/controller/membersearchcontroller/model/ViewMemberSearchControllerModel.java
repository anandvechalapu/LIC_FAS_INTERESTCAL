package com.sa.fund.interest.controller.membersearchcontroller.model;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;

public class ViewMemberSearchControllerModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String payload;
	private ResponseEntity<Object> response;
	private boolean recordExist;
	
	public ViewMemberSearchControllerModel() {
		super();
	}

	public ViewMemberSearchControllerModel(String payload, ResponseEntity<Object> response, boolean recordExist) {
		super();
		this.payload = payload;
		this.response = response;
		this.recordExist = recordExist;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public ResponseEntity<Object> getResponse() {
		return response;
	}

	public void setResponse(ResponseEntity<Object> response) {
		this.response = response;
	}

	public boolean isRecordExist() {
		return recordExist;
	}

	public void setRecordExist(boolean recordExist) {
		this.recordExist = recordExist;
	}
	
}