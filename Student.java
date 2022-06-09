package com.day7ass;

public class Student {
int studentid ;
String Studentname;
double Examfee;
public void displaydetails() {
	System.out.println(studentid);
	System.out.println(Studentname);
	System.out.println(Examfee);
	
}
public double payfee() {
	return Examfee;
}

}
