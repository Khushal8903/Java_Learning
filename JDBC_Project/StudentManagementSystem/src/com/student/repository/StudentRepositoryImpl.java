package com.student.repository;

import java.sql.*;

import com.student.model.Student;

import com.student.util.DBUtil;

public class StudentRepositoryImpl implements StudentRepository {

	Connection con = DBUtil.getConnection();

	public void save(Student student) {
		try {
			String sql = "insert into student(name,email,marks) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setInt(3, student.getMarks());

			ps.executeUpdate();
			System.out.print("Student Saved");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void findAll() {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") + " "
						+ rs.getInt("Marks"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateMarks(int id, int marks) {
		try {
			String sql = "update student set marks=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marks);
			ps.setInt(2, id);

			ps.executeUpdate();
			System.out.println("Marks updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(int id) {
		try {
			String sql = "delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ps.executeUpdate();
			System.out.println("Student Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
