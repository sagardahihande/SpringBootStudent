package com.jsp.SprintBootStudent.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SprintBootStudent.dto.Student;
import com.jsp.SprintBootStudent.repository.Studentrepo;


@Repository
public class StudentDao {
	
	@Autowired
	private Studentrepo repo;
	
	public Student saveStudent(Student student)
	{
		return repo.save(student);
	}
   
	
	public Student updateStudent(int id, Student student)
	{
		     Student s =repo.findById(id).get();
		     if(s!=null)
		     {
		    	 student.setId(id);
		    	return  repo.save(student);
		     }
		     return null;
	}
	
	public Student findStudent(int id)
	{
		return repo.findById(id).get();
	}
}
