package school;

import java.util.Scanner;

public class Soulution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pizzabox = 6;
			while(pizzabox%n!=0) {
				pizzabox+=6;
			}
			System.out.println("피자 판 수 : "+ pizzabox/6);
	}

}
