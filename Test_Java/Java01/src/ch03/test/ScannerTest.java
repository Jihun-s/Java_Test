package ch03.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//sc는 Scanner이라고 하는 클래스의 "참조형" 변수
		//참조형은 주소값이 아님. 참조해서 저장되는 데이터 형식.
		
		//new는 참조형 데이트를 올려주세요 라고 하는 요청의 키워드
		//참조형 변수를 초기화 하는 변수는 new
		//딜리트는 Garbage Collector가 실행.
		Scanner sc = new Scanner(System.in);
		//Scanner(System.in); = 생성자 = 클래스(내용);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("입력한 나이는 "+age+ "입니다.");
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println("이름은 "+name+ "입니다.");
		System.out.print("주소 입력: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("주소는 "+address+ "입니다.");
	}
}
