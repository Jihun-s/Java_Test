package ch04.test;

public class StarPattern2 {

	public static void main(String[] args) {
		int lineCount = 21;
		int spaceCount = lineCount-1;
		int starCount=1;
		
		for(int i =0; i<lineCount; i++) {
			if(i<lineCount/2) {
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
			System.out.println();
			}
			else {
				for(int j=0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				for(int j=0; j<starCount; j++) {
					System.out.print('*');
				}
				for(int j=0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				spaceCount +=1;
				starCount -=2;
				System.out.println();
				
			}
		}	
	}
}
