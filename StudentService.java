package com.sw409.StudentDemo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.StudentDemo.controllers.Respositories.StudentRepository;
import com.sw409.StudentDemo.models.Student;

import java.util.ArrayList;
@Service
public class StudentService {
List<Student> studentList = new ArrayList<>();
@Autowired
StudentRepository studentRepository;
//create

public Student createStudent(Student student) {
	studentList.add(student);
	return student;
}

//read
public List<Student>findAllStudents(){
	return (List<Student>) (studentRepository.findAll());
}

//update
public void updateStudent(Integer id, Student s){
	for(int i = 0; i <studentList.size(); i++) {
		if(studentList.get(i).getId().equals(id)){
			studentList.set(i, s);
		}
	}
}

//Delete
public void deleteStudent(Integer id, Student student) {


}

}


