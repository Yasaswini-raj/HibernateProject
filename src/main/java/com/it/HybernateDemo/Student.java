package com.it.HybernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//this entity class is mapped to student table in database
@Entity
@Table(name="student")
public class Student {

	//studentId property is mapped with id column of student table
	//@Id annotation tells the id column indicates primary key of the table
	@Id
	@Column(name="id")
	private int studentId;

	//studentName property is mapped with name column of student table
	@Column(name="name")
	private String studentName;

	//studentPhoneNumber property is mapped with phoneNumber column of student table
	@Column(name="phoneNumber")
	private String studentPhoneNumber;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNumber="
				+ studentPhoneNumber + "]";
	}



	
}
