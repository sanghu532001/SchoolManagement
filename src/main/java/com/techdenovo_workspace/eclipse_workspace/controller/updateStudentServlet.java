package com.techdenovo_workspace.eclipse_workspace.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo_workspace.eclipse_workspace.dao.StudentDao;
import com.techdenovo_workspace.eclipse_workspace.model.Student;


/**
 * Servlet implementation class Update
 */
@WebServlet("/edit")
public class updateStudentServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao studentDao=new StudentDao();
		int id = Integer.parseInt(request.getParameter("id"));
        Student existingStudent = studentDao.getStudent(id);
        request.setAttribute("student", existingStudent);
        request.getRequestDispatcher("/update.jsp").forward(request, response);
	            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	        Student student = new Student();
	        student.setId(Integer.parseInt(request.getParameter("id")));
	        student.setFirstName(request.getParameter("first-name"));
	        student.setLastName(request.getParameter("last-name"));
	        student.setMotherName(request.getParameter("mother-name"));
	        student.setFatherName(request.getParameter("father-name"));

	        StudentDao studentDao=new StudentDao();
	        studentDao.updateDetails(student);
	        response.sendRedirect("displayData");
	        
	    }
	}


