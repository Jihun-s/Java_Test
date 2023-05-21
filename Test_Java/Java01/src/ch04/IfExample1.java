package ch04;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		if(age >=8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}

	}

}
