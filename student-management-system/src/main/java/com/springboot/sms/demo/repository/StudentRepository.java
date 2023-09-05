package com.springboot.sms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
