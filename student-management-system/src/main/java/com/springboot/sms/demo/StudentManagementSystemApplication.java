package com.springboot.sms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sms.demo.entity.Student;
import com.springboot.sms.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student s1 = new Student ("Nandar", "Lwin", "nandar@gmail.com");;
		 * studentRepository.save(s1);
		 * 
		 * Student s2 = new Student ("Su Su", "Lwin", "nandar@gmail.com");;
		 * studentRepository.save(s2);
		 * 
		 * Student s3 = new Student ("Pa Pa", "Lwin", "nandar@gmail.com");;
		 * studentRepository.save(s3);
		 */
	}

}
