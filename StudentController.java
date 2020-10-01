package com.sw409.StudentDemo.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.StudentDemo.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.sw409.StudentDemo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class StudentController {
	@Autowired
StudentService stuService;
//create
@PostMapping("api/v1/students")
public Student createStudent(@RequestBody Student student) {
	return stuService.createStudent(student);
}
//Read
@GetMapping("api/v1/students")
public List<Student> findAllStudents()
{
	return stuService.findAllStudents();
	
}
//Update
@PutMapping("api/v1/students/{studentid}")
public void updateStudent(@PathVariable("studentid")Integer id, @RequestBody Student student)
{
	stuService.updateStudent(id, student);
}
//Delete
@DeleteMapping("api/v1/students/{studentid}")
public void deleteStudent(@PathVariable("studentid")Integer id, @RequestBody Student student)
{
	stuService.deleteStudent(id,student);
}
}
