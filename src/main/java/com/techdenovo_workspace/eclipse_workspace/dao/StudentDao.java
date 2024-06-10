package com.techdenovo_workspace.eclipse_workspace.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.techdenovo_workspace.eclipse_workspace.Dbutil.DbUtil;
import com.techdenovo_workspace.eclipse_workspace.model.Student;

public class StudentDao { 
	DbUtil dbUtil=new DbUtil();

//	ADD STUDENT DETAILS
	public void addStudents(Student student){
		if (!student.getFirstName().isEmpty() && !student.getLastName().isEmpty()) {
		
		try {
			Connection conn=dbUtil.getDbConnection();
			String sql= "INSERT INTO students (id,firstName,lastName,motherName,fatherName) values(?,?,?,?,?)";
			PreparedStatement pS=conn.prepareStatement(sql);

			pS.setInt(1, student.getId());
			pS.setString(2, student.getFirstName());
			pS.setString(3, student.getLastName());
			pS.setString(4, student.getMotherName());
			pS.setString(5, student.getFatherName());
			
			int i=pS.executeUpdate();
			if (i>0) {
				System.out.println("You Have Succefully Registered");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		}	
		
	}
	
//	GET STUDENT
	public Student getStudent(int id) {
        Student student = null;
        try (Connection conn = dbUtil.getDbConnection()) {
            String sql = "SELECT * FROM students WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setFirstName(rs.getString("firstName"));
                student.setLastName(rs.getString("lastName"));
                student.setMotherName(rs.getString("motherName"));
                student.setFatherName(rs.getString("fatherName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
	
//	GET ALL STUDENT DETAILS
	public List<Student> getAllStudents() {
		
		List<Student> studentlList=new ArrayList<>();
		try {
			Connection conn=dbUtil.getDbConnection();
			String sql= "SELECT * FROM students;";
			PreparedStatement ps=conn.prepareStatement(sql);	
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				student.setMotherName(rs.getString("motherName"));
				student.setFatherName(rs.getString("fatherName"));
				studentlList.add(student);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return studentlList;
	}
	
	
//	UPDATE STUDENT DETAILS
	public void updateDetails(Student student) {
		try (Connection conn = dbUtil.getDbConnection()) {
            String sql = "UPDATE students SET firstName = ?, lastName = ?, motherName = ?, fatherName = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getMotherName());
            ps.setString(4, student.getFatherName());
            ps.setInt(5, student.getId());
            ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
				
	
	}
//	DELETE STUDENT DETAILS
	public void deleteStudent(int id) {
		 try  {
			 	Connection conn = dbUtil.getDbConnection();
	            String sql = "DELETE FROM students WHERE id = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, id);
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
