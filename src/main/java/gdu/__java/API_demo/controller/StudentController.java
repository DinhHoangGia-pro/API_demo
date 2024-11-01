package gdu.__java.API_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/liststudents")
	public String[] listStudents()
	{
	return new String[]{"Nguyễn Văn A", "Nguyễn Văn B", "Trần Thị C"};
	}

}
