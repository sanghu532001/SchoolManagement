package com.techdenovo_workspace.eclipse_workspace.model;

public class Student {
	int id;
	String firstName;
	String lastName;
	String motherName;
	String fatherName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String firstName, String lastName, String motherName, String fatherName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", motherName="
				+ motherName + ", fatherName=" + fatherName ;
	}
	
	

}
