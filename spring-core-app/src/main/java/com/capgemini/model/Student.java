package com.capgemini.model;

public class Student {
private int rollNumber;
private String studentName;
private double avgScore;

private Address homeAddress;//= new Address();


public Student() {
	System.out.println("---Student Object Created");
}

public Student(int rollNumber,String studentName, double avgScore) 
{
	this.rollNumber=rollNumber;
	this.studentName=studentName;
	this.avgScore=avgScore;
}




public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getAvgScore() {
	return avgScore;
}
public void setAvgScore(double avgScore) {
	this.avgScore = avgScore;
}
@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", avgScore=" + avgScore + "]";
}


}
