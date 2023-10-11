package net.group4.springboot.service;

import java.util.List;

import net.group4.springboot.entity.Student;

public interface StudentService {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
