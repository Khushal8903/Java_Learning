package com.student.service;

import com.student.model.Student;
import com.student.repository.*;

public class StudentServiceimpl implements StudentService {

	StudentRepository repo = new StudentRepositoryImpl();

	@Override
	public void addStudent(Student student) {
		repo.save(student);

	}

	@Override
	public void getAllStudents() {
		repo.findAll();
	}

	@Override
	public void updateStudentMarks(int id, int marks) {
		repo.updateMarks(id, marks);
	}

	@Override
	public void removeStudent(int id) {
		repo.deleteById(id);
	}

}
