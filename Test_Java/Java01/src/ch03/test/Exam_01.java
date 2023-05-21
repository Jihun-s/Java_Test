package ch03.test;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println();
		boolean result = a>0;
		System.out.println("num의 값 : " +a);
		System.out.println("result의 값 : " +result);
		
	}
}


