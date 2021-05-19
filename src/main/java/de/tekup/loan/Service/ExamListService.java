package de.tekup.loan.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.tekup.soap.models.whitetest.Exam;
import de.tekup.soap.models.whitetest.ExamRequest;
import de.tekup.soap.models.whitetest.ExamResponse;
import de.tekup.soap.models.whitetest.ObjectFactory;

@Service
public class ExamListService {

	public List<Exam>  examList =new ArrayList<Exam>();
	public List<Exam>  examList2 =new ArrayList<Exam>();
	
	public ExamResponse examsList(ExamRequest examRequest)
	{
		Exam e1=new Exam("redhat-8","redhat version 8");
		Exam e2=new Exam("aws","aws cloud practionner");
		Exam e3=new Exam("oca","oracle java 8");
		examList.add(e1);
		examList.add(e2);
		examList.add(e3);
		ExamResponse response=new ObjectFactory().createExamResponse();
		
		for(Exam e:examList) {
			
			if(e.getCode().equals(examRequest.getExamList())) {
				
				examList2.add(e);
			}
		}	
		
		response.setExam(examList2);
		
		return response;
		
	}
}
