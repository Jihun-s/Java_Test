package api;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		double d;
		String s1, s2;
		
		System.out.print("문자열:");
		s1 = scan.nextLine(); 
		System.out.print("정수:");
		i = scan.nextInt();
		System.out.print("실수:");
		d = scan.nextDouble();
		scan.nextLine();		//s1 = scan.next(); 에서 쌓인 Enter 싹다 처리
		System.out.print("문자열:");
		s2 = scan.nextLine();
		
		System.out.println(s1 + "," + i + "," + d + "," + s2);
	}

}
