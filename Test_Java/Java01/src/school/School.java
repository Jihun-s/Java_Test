package school;

public class School {
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		Teacher t = new Teacher();
		
		Student s2 = new Student("홍길동", "111111-1111111","010-1111-1111", 100,90,80);
		Teacher t2 = new Teacher("김철수", "999999-9999999","010-2222-2222", 10_000_000);
		//===== 다형성 =====
		test(s2);
		test(t2);
		
		System.out.println("======총점======");
		System.out.println(s2.getKor()+s2.getEng()+s2.getMat());
		System.out.println(s2.getTotal());		//int형으로 총점을 리턴하는 메소드
		System.out.println(s2.getAverage());	//double형으로 Average
		System.out.println(s2.getGrade());		//"A", "B"등 등급 리턴
		
		
		
		System.out.println(s2);
		System.out.println(t2);


		
		//Person p = new Student();
		//Person p2 = new Teacher();
		//Person p3 = new Person();
		//둘 다 적용 가능한 형식이 가능함.
		//좌변이 더 하위 객체일 경우도 불가함 - 상위타입의 변수가 하위타입의 변수를 참조할 수 있다.
		
		//Object o = new Student();
		//상위 클래스이지만 Person에서 만들어진 메소드는 인식 불가함.
		
		//String o = new Student();
	}
	public static void test(Person p)
	{	
		System.out.println(p.toString());
		if(p instanceof Student)
		{
			Student s = (Student) p;
			System.out.println(s.getKor()); 	//국어점수 출력
		}else if(p instanceof Teacher)
		{
			//or
			System.out.println(((Teacher)p).getSalary());	//급여 출력
		}
	}
}
