package de.tekup.loan.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.tekup.loan.Service.ExamListService;
import de.tekup.soap.models.whitetest.ExamRequest;
import de.tekup.soap.models.whitetest.ExamResponse;

@Endpoint
public class ExamListendpoint {
	public static final String nameSpace = "http://www.tekup.de/soap/models/whitetest";
	@Autowired
	private ExamListService ExamListService;
	@PayloadRoot(namespace = nameSpace, localPart = "ExamRequest")
	@ResponsePayload
	public ExamResponse getexam(@RequestPayload ExamRequest examRequest) {
		
		
		return ExamListService.examsList(examRequest);
	}

	
}
