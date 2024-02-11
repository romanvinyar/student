package telran.java51.student.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import telran.java51.student.dao.StudentRepository;
import telran.java51.student.dto.ScoreDto;
import telran.java51.student.dto.StudentCreateDto;
import telran.java51.student.dto.StudentDto;
import telran.java51.student.dto.StudentUpdateDto;
import telran.java51.student.dto.exceptions.StudentNotFoundException;
import telran.java51.student.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Boolean addStudent(StudentCreateDto studentCreateDto) {
		if (studentRepository.findById(studentCreateDto.getId()).isPresent()) {
			return false;
		}
		Student student = new Student(studentCreateDto.getId(), studentCreateDto.getName(),
				studentCreateDto.getPassword());
		studentRepository.save(student);
		return true;
	}

	@Override	
	public StudentDto findStudent(Integer id) {
		Student student = studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
		return new StudentDto(id, student.getName(), student.getScores());
	}

	@Override
	public StudentDto removeStudent(Integer id) {
//		Student student=studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
////		
////		
////		return new StudentDto(id, student.getName(), student.getScores());
//		studentRepository.findAll().remove(student);
		return null;
		
		
	}

	@Override
	public StudentCreateDto updateStudent(Integer id, StudentUpdateDto studentUpdateDto) {
//		Student student = studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
//		return new StudentUpdateDto()
		return null;
	}

	@Override
	public Boolean addScore(Integer id, ScoreDto scoreDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> findStudentsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getStudentsNamesQuantity(Set<String> names) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudentsByExamMinScore(String exam, Integer minScore) {
		// TODO Auto-generated method stub
		return null;
	}

}