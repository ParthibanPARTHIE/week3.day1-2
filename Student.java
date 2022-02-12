package student;

import department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name --> Student");
	}
	public void studentDept() {
		System.out.println("Student Dept --> Student");
	}
	public void studentId() {
		System.out.println("Student Id --> Student");
	}
public static void main(String[] args) {
	Student obj = new Student();
	obj.collegeCode();
	obj.collegeName();
	obj.collegeRank();
	obj.deptName();
	obj.studentDept();
	obj.studentId();
	obj.studentName();
}
	
	

}
