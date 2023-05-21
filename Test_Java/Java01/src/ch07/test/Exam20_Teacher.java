package ch07.test;

import java.util.Scanner;

public class Exam20_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = 0; //배열의 크기, 2이상의 값을 가져야 한다.
		int sum = 0;
		
		while(true) {
			System.out.print("배열의 크기: ");
			length = sc.nextInt();
			if(length > 1) break;
			System.out.println("2이상의 값을 입력하세요.");
		}
		int data[] = new int[length];
		
		for(int i=0; i<data.length; i++) {
			System.out.printf("배열[%d] = ", i);
			data[i] = sc.nextInt();
			sum += data[i];
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			if(i<data.length-1) {
			System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
	}

}
