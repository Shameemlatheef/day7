package com.day7ass;

public class Main {
public static void main(String[] args) {

	
	
   

   
    Employee e=new Employee();
    e.age=22;
    e.name="micheal";
    e.phonnumber="123434556";
    e.address="changannersy";
    e.salary=250000;
    e.specialisation="java";
    e.Department="R&D";
    Manager m=new Manager();
    m.name="micheal";
    m.age=25;
    m.address="changanssery";
    m.phonnumber="790730";
    m.salary=2500;
    m.specialisation="mer";
    m.Department="mech";
    m.printsalary();
    m.show();
    m.showdetails();
    e.printsalary();
    e.show();
    e.showdetails();
}
}
