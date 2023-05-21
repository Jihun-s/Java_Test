package ch04.test;

public class Exam16 {

	public static void main(String[] args) {
		int c = 1;
		for(int a = 0; a<5; a++) {
			for(int b=c; b<(c+5); b++) {
				System.out.print(b + " ");
			}
			System.out.println();
			c++;
		}System.out.println("----------");
		c=0;
		for(int a=0; a<5; a++) {
			for(int b=0; b<=c; b++) {
				System.out.print(b+" ");
			}
			c++;
			System.out.println();
		}System.out.println("----------");
		c=1;
		for(int a=0; a<5; a++) {
			for(int b=c; b<6; b++) {
				System.out.print(b+" ");
			}
			c++;
			System.out.println();
		}System.out.println("----------");
		
//		c=1; int k =4;
//		for(int a=0; a<5; a++) {
//			for(int j=1; j<c; j++) {
//				System.out.print(0+" ");
//			}
//				System.out.print(c+" ");
//			for(int j=0; j<k; j++) {
//				System.out.print(0+" ");
//			}c +=1; k -=1; System.out.println();
//		}
//		System.out.println("----------");
		
		for(int a=1; a<6; a++) {
			for(int b=1; b<6; b++) {
				System.out.printf("%d ", a==b? a:0);
			}System.out.println();
		}
	}

}
