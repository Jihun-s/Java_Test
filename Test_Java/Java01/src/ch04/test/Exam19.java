package ch04.test;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			printMainMenu();System.out.print("* 번호 선택 : ");
			int i = sc.nextInt();
			switch(i) {
				case 1: System.out.println("\"1. 전체 일정 보기\"");break;
				case 2: System.out.println("\"2. 일정 등록\"");break;
				case 3: System.out.println("\"3. 일정 검색\"");break;
				case 4: System.out.println("\"4. 일정 삭제\"");break;
				case 0: System.out.println("프로그램을 종료합니다."); System.exit(0);//프로그램을 완전히 종료함.
				default: System.out.println("없는 번호입니다. 다시 선택하세요.");break;
			}
		}
	}//main
	private static void printMainMenu() {
		System.out.println("[일정 관리]\n1. 전체 일정 보기\n2. 일정 등록\n3. 일정 검색\n4. 일정 삭제\n0. 종료");
	}
}
