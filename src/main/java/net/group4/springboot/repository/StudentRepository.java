package net.group4.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.group4.springboot.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
