package ch04.test;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		if((year % 4 ==0 && year % 100 != 0)|| year % 400 == 0) {
			System.out.printf("%d년은 윤년입니다.", year);
		}
		else System.out.printf("%d년은 평년입니다.", year);
	}

}
