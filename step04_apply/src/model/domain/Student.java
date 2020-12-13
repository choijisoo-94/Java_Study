package model.domain;

public class Student {

	
	String name; 
	int student_num;
	String grade; 


public Student(String name, int student_num, String grade) {
	this.name = name;
	this.student_num = student_num;
	this.grade = grade;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getStudent_num() {
	return student_num;
}


public void setStudent_num(int student_num) {
	this.student_num = student_num;
}


public String getGrade() {
	return grade;
}


public void setGrade(String grade) {
	this.grade = grade;
}


	public String toString() {
		return "Student [name = " + name + ", student_num = " + student_num + ", grade = " + grade + "]";
	}
}
