package com.hzw.learn.springboot.mybatis.dao;

import java.util.List;

import com.hzw.learn.springboot.mybatis.model.Student;

public interface StudentDao {
	
	Student addStudent(Student student);
	
	String delStudent(Integer id);
	
	String delStudentForId1();
	
	String updateStudent(Student student);
	
	List<Student> quetyStudentList(Student student);
}
