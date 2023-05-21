package ch04.test;

public class Exam17 {

	public static void main(String[] args) {
		int a; int count = 0;
		for(a=1; a<101; a++) {
			if(100%a==0) {
				System.out.print(a + " ");
				count++;
				if(count%3==0) System.out.println();
			}//if
		}
	}
}
