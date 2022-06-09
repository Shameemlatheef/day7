package com.day7ass;

import java.util.Scanner;

public class Demo1 {
public static Bank getBank(String bank){
if(bank.equalsIgnoreCase("axix")) {
	 Axix a=new Axix();
	a.branchname="neyytainkar";
	a.ifsccode="1072";
	a.Displaydetails();
	a.getcredit();
	return a;
}
else if(bank.equalsIgnoreCase("Icici")) {
	Icici i=new Icici();
	i.branchname="nedumkandam";
	i.ifsccode="2009";
	i.Displaydetails();
	return i;
}
else {
	return null;
}
	}
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("enter bank");
	String d=p.next();
	getBank(d);
	
	
}
}
