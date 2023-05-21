package ch04.test;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
//		if(a%2==0) {
//			System.out.println(a + " : 짝수입니다.");
//		}
//		else {
//			System.out.println(a + " : 홀수입니다.");
//		}
		boolean odd = a % 2 == 0? true:false;
		System.out.printf("%d : %s입니다.",a, odd? "짝수":"홀수");
	}

}
