package ch03.test;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		int thou50 = price/50000;
		int thou10 = price%50000/10000;
		int thou5 = price%10000/5000;
		int thou = price%5000/1000;
		int change = price%1000;
		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.",
		price, thou50, thou10, thou5, thou, change);
	}

}
