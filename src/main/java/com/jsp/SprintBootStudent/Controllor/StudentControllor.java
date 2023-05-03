package com.jsp.SprintBootStudent.Controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SprintBootStudent.dao.StudentDao;
import com.jsp.SprintBootStudent.dto.Student;
import com.jsp.SprintBootStudent.service.StudentService;
import com.jsp.SprintBootStudent.util.ResponseStructure;

@RestController
public class StudentControllor {
	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/save")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@PutMapping("/update")
	public ResponseStructure<Student> updateStudent(@RequestParam int id, @RequestBody Student student)
	{
		return service.updateStudent(id, student);
	}
	
	@GetMapping("/fetch")
	public ResponseStructure<Student> findStudent(@RequestParam int id)
	{
		return service.findStudent(id);
		
	}

}
