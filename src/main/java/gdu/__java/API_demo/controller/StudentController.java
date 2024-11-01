package gdu.__java.API_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gdu.__java.API_demo.model.MyDB;
import gdu.__java.API_demo.model.Student;



@RestController
public class StudentController {
	
	
	
	@Autowired
	MyDB mydb;
	
	@GetMapping("/liststudents")
	public List<Student> ListStudents()
	{				
		return mydb.findAll();
		
	}
	
	
	@PostMapping("/insertStudent")
	public String insertStudent(@RequestBody Student newstudent)
	{		
		mydb.save(newstudent);		
		return "Thêm sinh viên thành công!";	
		
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student)
	{	
		mydb.save(student);		
		return "Sửa sinh viên thành công!";		
		
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{		
		mydb.deleteById(id);		
		return "Xóa thành công!";
			
	}

}
