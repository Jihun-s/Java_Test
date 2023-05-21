package school.vo;

import java.io.Serializable;

//abstract - 객체 생성을 못하게 만듦 - 추상클래스.
public abstract class Person implements Serializable{		// Serializable - 직렬화. 상위 타입에 하자.
	private String name;
	private String id;
	private String phone;
	
	//생성자
	public Person() {
	}
	
	public Person(String name, String id, String phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//Overriding - 상속받은 메소드를 재정의.
	//return타입 같게, 접근지정자는 같거나 더 개방적, 이름은 동일, 예외는 같거나 더 하위타입으로.
	public String toString()
	{
		String s = "\n이름:" +this.name + " 학번:" + this.id + " 전화번호:" + phone;
		return s;
	}
}
