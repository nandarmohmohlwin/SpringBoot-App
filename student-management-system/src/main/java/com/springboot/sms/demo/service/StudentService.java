package com.springboot.sms.demo.service;

import java.util.List;

import com.springboot.sms.demo.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(long id);
	Student editStudent(Student student);
	void deleteStudentById(long id);
}
