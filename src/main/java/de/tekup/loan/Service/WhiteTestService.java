package de.tekup.loan.Service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import de.tekup.soap.models.whitetest.Exam;
import de.tekup.soap.models.whitetest.ObjectFactory;
import de.tekup.soap.models.whitetest.Student;
import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;

@Service
public class WhiteTestService {
	
	public List<Student>students=new ArrayList<Student>();
	public List<Exam>exams=new ArrayList<Exam>();
	
	
	public WhiteTestResponse CheckExamCode(StudentRequest studentRequest) throws DatatypeConfigurationException {

		Student s1=new Student(1,"moatez","rades");
		Student s2=new Student(2,"taaz","arianna");
		Student s3=new Student(3,"omar","megrine");
		
		Exam e1=new Exam("redhat-8","redhat version 8");
		Exam e2=new Exam("aws","aws cloud practionner");
		Exam e3=new Exam("oca","oracle java 8");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		
		Student errorStudent = new Student (-1, "falseName","falseAddress");
		Exam errorExam = new Exam ("-1","falseExam");
		
		WhiteTestResponse response = new ObjectFactory().createWhiteTestResponse();
		
	
		response.setStudent(errorStudent);
		response.setExam(errorExam);
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = 
            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		
       for(Student s:students) {
    	   if(s.getId() == studentRequest.getStudentId()) {
    		   response.setStudent(s);
    	   
    	   
    	   }
       }
    	   
    	   for(Exam e:exams) {
    		   if(e.getCode().equals(studentRequest.getExamCode())) {
    			   response.setExam(e);
    		   }
    	   }
    	   response.setDate(now);
    	   
 
     
		
		return response;
		
		
	}

}
