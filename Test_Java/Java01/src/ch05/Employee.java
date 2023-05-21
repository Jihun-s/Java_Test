package ch05;

public class Employee {
	String name;
	String dept;
	double salary;
	
	public Employee(String name, String dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee(String name, String dept) {
		this(name, dept, 100);
		
		// this: 같은 클래스 안에서 다른 생성자를 호출하라
	}

}
