package week3.day1;

public class Employees {

	String empName;
	int empId;
	/*
	 * boolean isEmployeeActive; double empSalary ;
	 */

	Employees() {
		//this("prasad", 200);
		System.out.println("default constructor of employees");
	}

	Employees(String empName, int empId) {
		this();
		System.out.println("parameterized constructor");
		this.empName = empName;
		this.empId = empId;

	}

	public static void main(String[] args) {
		// ClassName objectName = new ClassName()
		Employees emp = new Employees("Prasad", 200);

		System.out.println(emp.empName);
		System.out.println(emp.empId);
		// System.out.println(emp.isEmployeeActive);
		// System.out.println(emp.empSalary);

		// System.out.println("test code");

	}

}
