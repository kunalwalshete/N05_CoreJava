// Program to define Service interface for JDBC CRUD Operation on Student
package org.tns.jdbcmvc;

import java.sql.SQLException;
import java.util.List;

public interface IsStudentService {
	
	void addStudent(Student student) throws SQLException;

	List<Student> getAllStudents() throws SQLException;
	
	List<Student> getStudentByPer(float value) throws SQLException;
	
	List<Student> getStudentNameStartWith(String str) throws SQLException;
	
	int deleteAllStudents() throws SQLException;
	
	int deleteByRollNo(int value) throws SQLException;
	
	int updateStudentper(float value) throws SQLException;
	
	int updateStudentPerByRollNo(int rvalue, float pvalue) throws SQLException;
	
	
	
}
