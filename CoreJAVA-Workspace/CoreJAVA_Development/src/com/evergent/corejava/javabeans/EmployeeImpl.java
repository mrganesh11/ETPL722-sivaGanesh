package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEno(100);
		e.setEname("Gani");
		e.setSal(50000.00);
		System.out.println("Employee No: "+e.getEno());
		System.out.println("Employee Name: "+e.getEname());
		System.out.println("Employee Sal: "+e.getSal());
		
	}

}
