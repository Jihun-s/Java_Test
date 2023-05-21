package ch04.test;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 순서 숫자1 기호(-,+,*,/) 숫자2");
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		double result = 0.0;
		boolean is_print = true;
		
		switch(operator){
			case '+': result =(num1 + num2);break;
			case '-': result =(num1 - num2);break;
			case '*': result =(num1 * num2);break;
			case '/': 
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");return;
			}else result =(num1 / num2);
			default : System.out.println("연산자 오류!");return;
				}
		System.out.printf("값 = %.2f",result);
		
		
				
//		double result = 0.0;
//		System.out.println("입력 순서 숫자1 기호(-,+,*,/) 숫자2");
//		int num1 = sc.nextInt();
//		String operator = sc.next();
//		int num2 = sc.nextInt();
//		boolean is_print = true;
//		
//		if(operator.equals("+")) {
//			result = num1 + num2;
//		}else if(operator.equals("-")) {
//			result = num1 - num2;
//		}else if(operator.equals("*")) {
//			result = num1 * num2;
//		}else if(operator.equals("/")) {
//			if(num2==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				is_print = false;
//			}else {
//			result = num1 / num2;
//			}
//		}else {
//			System.out.println("연잔사 오류!");
//		}
//		
//		if(is_print)System.out.printf("값 = %.2f",result);
	}

}
