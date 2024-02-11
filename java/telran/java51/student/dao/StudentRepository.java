package telran.java51.student.dao;

import java.util.Collection;
import java.util.Optional;

import telran.java51.student.model.Student;

public interface StudentRepository {
	Student save(Student student);
	
	Optional<Student> findById(int id);
	
	Collection<Student> findAll();
}
