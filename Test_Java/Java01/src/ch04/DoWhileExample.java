package ch04;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum+= num;
			num++;
		}while(num<=10);
		
		System.out.printf("1부터 10까지의 합은 %d입니다.", sum);
	}

}
