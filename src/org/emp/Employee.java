package org.emp;

public class Employee {
	private void empId() {
		System.out.println("empId:1234");
	}
public void empName() {
	System.out.println("empName:ABCD");
}
public void empDob() {
	System.out.println("empDob:03/03/1993");
	System.out.println("EmpDob:3rd Mar 1993");
	System.out.println("Valid DOB");
}
public void empPhone() {
	System.out.println("empPhone:+91-1234567890");
}
public void empEmail() {
	System.out.println("empEmail:abcd@gmail.com");
}
public void empAddress() {
	System.out.println("empAddress:ABCD");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
