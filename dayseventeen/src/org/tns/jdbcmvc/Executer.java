package org.tns.jdbcmvc;

import java.sql.SQLException;
import java.util.List;

public class Executer {

	public static void main(String[] args) {
		StudentServiceImpl service;
		List<Student> studList;
		int n;
		Student st;		
		
		try 
		{
			// object for StudentServiceImpl 
		    service = new StudentServiceImpl();

			 // Initilizing student to insert it in add method
			 st = new Student(1,"Kunal",81);
			 // adding new entry to database
			 service.addStudent(st);
			 service.addStudent(new Student(2,"Ashutosh",71));
			 service.addStudent(new Student(3,"Vishal",61));
			
		    // displaying student records
			 studList = service.getAllStudents();
			 System.out.println(studList.isEmpty()?"\n...No Records available...":
				 									"\n......Student Records.....\n"+studList);
			
			// displaying student records who have percentage greater than 80
			 studList = service.getStudentByPer(80);
			System.out.println(studList.isEmpty()?"\n...No Records available of students having per more than 80 ...":
													"\n...Records of student having percentage more than 80...\n"+studList);
	
			
			// displaying student records whose name's like "kunal"
			studList = service.getStudentNameStartWith("Kunal");
			System.out.println(studList.isEmpty()?"\n...No Records available of students having name like 'Kunal'...":
													"\n...Records having sname like 'Kunal'...\n"+studList);
			
			
			// updating percentage
			System.out.println("\n....Updating students percentage +10....");
			n=service.updateStudentper(10);
			System.out.println(n>0?n+" ...Records updated...\n"+service.getAllStudents():"...No students available...\n");
			

			
			// updating percentage by roll no
			System.out.println("\n....Updating students percentage by 5 whoes roll no is 3...");
			n=service.updateStudentPerByRollNo(3, 5);
			System.out.println(n>0?n+" ...Records updated...\n"+service.getAllStudents():"...No students available...\n");
			
			
			// deleting records based on roll no
			System.out.println("\n....Deleteing records whoes roll no is 3...");
			System.out.println(service.deleteByRollNo(3)+ " Records deleted");
			
			// deleting all records
			System.out.println("\n....deleteing all records....");
			System.out.println(service.deleteAllStudents()+" Records deleted");
			
		
			
		
			
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
