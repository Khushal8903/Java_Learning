package com.student.repository;

import com.student.model.Student;

public interface StudentRepository{
		
		void save(Student student);
		void findAll();
		void updateMarks(int id , int marks);
		void deleteById(int id);
		
}

