package school.vo;

import school.vo.Person;

public class Teacher extends Person
{
	private int salary;
	
	//생성자
	public Teacher()
	{
		super();
	}

	public Teacher(String name, String id, String phone, int salary)
	{
		super(name, id, phone);
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public String toString()
	{	
		String s = super.toString();
		String b = "\n급여:" + this.salary;
		return s+b;
	}
}
