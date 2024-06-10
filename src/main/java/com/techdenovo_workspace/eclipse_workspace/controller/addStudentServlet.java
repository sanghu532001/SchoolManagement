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
 * Servlet implementation class CreateDetails
 */
@WebServlet("/addStudentServlet")
public class addStudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student=new Student();
		response.setContentType("text/html");
		
		student.setId(Integer.parseInt(request.getParameter("id")));
		student.setFirstName(request.getParameter("first-name"));
		student.setLastName(request.getParameter("last-name"));
		student.setMotherName(request.getParameter("mother-name"));
		student.setFatherName(request.getParameter("father-name"));
		
		StudentDao studentDao=new StudentDao();
		studentDao.addStudents(student);
		response.sendRedirect("displayData");
		
	}

}
