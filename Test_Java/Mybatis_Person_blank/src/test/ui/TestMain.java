package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		Scanner sc = new Scanner(System.in);

		
//---입력
//		Person pe;
//		pe = new Person("장철수", 30);
//		dao.insertPerson(pe);
		
//---삭제
//		int n = 1;
//		if(dao.deletePerson(n)==0)
//		{
//			System.out.println(n+"번 회원이 없습니다.");
//		}else {
//			System.out.println("삭제되었습니다.");
//		}
		
//---수정
//		Person p = new Person(2, "이철수", 40);
//		int n = dao.updatePerson(p);
//		System.out.println(n + "건 수정 완료");
		
//---1건 조회(전달된 번호에 해당하는 회원정보를 Person 객체로 리턴)
//		Person p = dao.selectOne(2);
//		System.out.println(p);
		
//---전체 조회
//		ArrayList<Person> a = dao.selectALL();
//		for(Person p:a)
//		{
//			System.out.println(p);
//		}
//---이름으로 검색
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		//키보드로 문자열 입력
		ArrayList<Person> a = dao.selectName(name);
		for(Person p:a)
		{
			System.out.println(p);
		}
		//그 문자열이 포함된 회원검색
		
		
	}
}
