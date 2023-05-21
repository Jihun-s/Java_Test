package ch07.test;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("배열의 크기 : ");
		int a = sc.nextInt();
		
		if(a<1) {
			System.out.println("2 이상의 값을 입력하세요.");
		}else {
			int num[] = new int[a];
			int i; int d; int k=0;
				for(i=0; i<num.length; i++) {
					System.out.printf("배열[%d] = %d\n", i, (i+1));
					
				}
				for(d=1; d<i+1; d++) {
					k +=d;
					System.out.print(d);
					if(d<i) {
					System.out.print(" + ");
					}
				}
				System.out.print(" = " +k);
				return;
			}
		}
	}
}
