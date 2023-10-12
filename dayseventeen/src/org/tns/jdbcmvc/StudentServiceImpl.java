package org.tns.jdbcmvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IsStudentService {
	
	static Connection cn;
	
	// statement and preparedstatement are the interfaces which are used to fire a sql query
	Statement st;
	PreparedStatement pst;
	
	// constructor
	public StudentServiceImpl() throws SQLException{
		cn = DBUtil.getCn();
		st = cn.createStatement();
		}
	

	// Method to add student to database
	@Override
	public void addStudent(Student student) throws SQLException{
//		Static query
//		String sql = "INSERT INTO student VALUES("+student.getRollno()+","+student.getSname()+","+student.getPer()+")";
//		int n = st.executeUpdate(sql);
		
		// dynamic query
		pst = cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1,student.getRollno());
		pst.setString(2,student.getSname());
		pst.setFloat(3,student.getPer());
	    pst.executeUpdate();
		pst.close();
		System.out.println("Student added....");	
	}
	

	// method fetch all student
	@Override
	public List<Student> getAllStudents() throws SQLException {
		
		List<Student> studList = new ArrayList<Student>();
		// list of type student
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		while(rs.next()){
			Student st = new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			// adding elements to list so we can display it
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	
	// method to fetch student by percentage
	@Override
	public List<Student> getStudentByPer(float value) throws SQLException {
		
		List<Student> studList = new ArrayList<Student>();
		// ResultSet rs = st.executeQuery("SELECT * FROM student WHERE per>="+value);
		pst = cn.prepareStatement("SELECT * FROM student WHERE per>=?");
		pst.setFloat(1, value);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			Student st = new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
		}
		
		pst.close();
		rs.close();
		return studList;

	}

	// method to fetch student by their names
	@Override
	public List<Student> getStudentNameStartWith(String str) throws SQLException {
		List<Student> studList = new ArrayList<Student>();
		// ResultSet rs = st.executeQuery("SELECT * FROM student WHERE sname LIKE "+value);
		pst = cn.prepareStatement("SELECT * FROM student WHERE sname LIKE ?");
		pst.setString(1, str);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			Student st = new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
		}
		
		pst.close();
		rs.close();
		return studList;
	}

	// method to delete all records
	@Override
	public int deleteAllStudents() throws SQLException {
	    int n = st.executeUpdate("DELETE FROM student");
		return n;
	}

	// method to delete students by their roll no.
	@Override
	public int deleteByRollNo(int value) throws SQLException {
		int n = st.executeUpdate("DELETE FROM student WHERE rollno="+value);
		return n;
	}

	// method to update percentage of all students
	@Override
	public int updateStudentper(float value) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET per=per+? WHERE per<=?");
		pst.setFloat(1, value);
		pst.setFloat(2,100-value);
		int n = pst.executeUpdate();
		return n;
	}
	
	// method to update percentage of students by their rollno
	@Override
	public int updateStudentPerByRollNo(int rvalue, float pvalue) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET per=per+? WHERE rollno=?");
		pst.setFloat(1, pvalue);
		pst.setInt(2, rvalue);
		int n = pst.executeUpdate();
		return n;
	}

	
}
