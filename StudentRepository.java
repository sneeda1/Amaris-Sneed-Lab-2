package com.sw409.StudentDemo.controllers.Respositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.StudentDemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
