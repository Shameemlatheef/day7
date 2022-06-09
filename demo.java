package com.day7ass;

public class demo {
public static void main(String[] args) {
	Dayscholar d=new Dayscholar();
	Hosteller h= new Hosteller();
	d.Studentname="shameem";
	d.studentid=101;
	d.transprtfee=2000;
	d.Examfee=1000;
	d.displaydetails();
	d.payfee();
	System.out.println("total"+d.payfee());
	h.studentid=100;
	h.Studentname="micheal";
	h.Examfee=1500;
	h.hostelfee=3000;
	h.displaydetails();
	h.payfee();
	System.out.println("total"+h.payfee());
}
}
