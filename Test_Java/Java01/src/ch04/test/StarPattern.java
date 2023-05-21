package ch04.test;

public class StarPattern {

	public static void main(String[] args) {
		int lineCount = 5;
		int spaceCount = lineCount-1;
		int starCount=1;
		
		for(int i =0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount -=1;
			starCount +=2;
			System.out.println();}
		
		
//			int k = 3;
//			for(int i=1; i<=7; i+=2) {
//				for(int d=k--; d>0; d--) {
//					System.out.print(" ");
//				}
//					for(int j=0; j<i; j++) {
//						System.out.print('*');
//					}System.out.println();
//		}	
	}
}
