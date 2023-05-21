package ch04.test;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1; int total = 0;
		while(true) {
			System.out.print("정수 입력 : ");
			a = sc.nextInt();
			total +=a;
			if(a==0) break;
		}
		System.out.println("합계 : " + total);
	}
}
