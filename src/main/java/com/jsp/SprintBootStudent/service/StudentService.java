package com.jsp.SprintBootStudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.SprintBootStudent.dao.StudentDao;
import com.jsp.SprintBootStudent.dto.Student;
import com.jsp.SprintBootStudent.util.ResponseStructure;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public ResponseStructure<Student> saveStudent(Student student)
	{
		   Student student1 =dao.saveStudent(student);
		   if(student1!=null)
		   {
			   ResponseStructure<Student> s = new ResponseStructure<Student>();
			   s.setMessage("data saved successfully");
			   s.setStatus(HttpStatus.CREATED.value());
			   s.setData(student1);
			    return s;
		   }
		return null;
		   
	}
	
	public ResponseStructure<Student> updateStudent(int id, Student student)
	{
		 Student s1 = dao.updateStudent(id, student);
		 if (s1!=null)
		 {
			ResponseStructure<Student> str = new ResponseStructure<Student>();
			str.setMessage("data updated successfully");
			str.setStatus(HttpStatus.OK.value());
			str.setData(s1);
			return str;
		}
		 
		 return null;
	}
	
	
	public ResponseStructure<Student> findStudent(int id)
	{
		 Student student  = dao.findStudent(id);
		 if(student!=null)
		 {
			 ResponseStructure<Student> str = new ResponseStructure<Student>();
			 str.setMessage("data fetch successfully");
			 str.setStatus(HttpStatus.OK.value());
			 str.setData(student);
			 return str;
		 }
		 return null;
	}
}
