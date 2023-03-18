package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Prianka");
	}
	public void studentDept() {
		System.out.println("Mechanical dept");
	}
	public void studentId() {
		System.out.println("student id is : 6558259");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student callSuperClass = new Student();
		
		callSuperClass.collegeName();
		callSuperClass.collegeCode();
		callSuperClass.collegeRank();
		callSuperClass.deptName();
		callSuperClass.studentName();
		callSuperClass.studentDept();
		callSuperClass.studentId();
		
	}

}
