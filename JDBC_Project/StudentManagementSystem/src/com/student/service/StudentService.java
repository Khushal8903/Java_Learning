package com.student.service;

import com.student.model.Student;

public interface StudentService {

	void addStudent(Student student);

	void getAllStudents();

	void updateStudentMarks(int id, int marks);

	void removeStudent(int id);

}
