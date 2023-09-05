package com.springboot.sms.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.demo.entity.Student;
import com.springboot.sms.demo.repository.StudentRepository;
import com.springboot.sms.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student editStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
	}

}
