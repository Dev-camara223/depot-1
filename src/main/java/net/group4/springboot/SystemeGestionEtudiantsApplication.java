package net.group4.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.group4.springboot.entity.Student;
import net.group4.springboot.repository.StudentRepository;

@SpringBootApplication
public class SystemeGestionEtudiantsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SystemeGestionEtudiantsApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 
		 /* Student student1 = new Student("Camara", "Seydou", "camara@gmail.com");
		  studentRepository.save(student1);
		  
		  Student student2 = new Student("Cams", "Kadidja", "kadidja@gmail.com");
		  studentRepository.save(student2);
		  
		  Student student3 = new Student("sby", "spra", "sby@gmail.com"); 
		  studentRepository.save(student3); */
		 
		
	}

}

