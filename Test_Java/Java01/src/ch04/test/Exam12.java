package ch04.test;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		int mon = sc.nextInt();
		
//			로컬 변수(local variable): 메서드 안에 선언되는 변수
//			로컬 변수는 사용하기 전에 반드시 초기화가 되어있어야 한다.
//			따라서 선언과 동시에 기본 값으로 초기화를 한다.
		int maxDays = 0;
		switch(mon) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				maxDays = 31;
				break;
			case 4: case 6: case 9: case 11:
				maxDays = 30;
				break;
			case 2:
				maxDays = ((year % 4 ==0 && year % 100 != 0)|| year % 400 == 0)? 29:28;
				break;
			default: System.out.println("월 입력 오류!");
		}//switch
		System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, mon, maxDays);
	}
}
