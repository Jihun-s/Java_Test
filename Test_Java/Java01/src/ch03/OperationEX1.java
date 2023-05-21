package ch03;

public class OperationEX1 {

	public static void main(String[] args) {
		int i = 10, j = 5, k;
		k = ++i + j--;
		System.out.println("i=" +i+ " j=" +j+ ",k=" +k);
		k = i-- + --j;
		System.out.println("i=" +i+ " j=" +j+ ",k=" +k);
		
		
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		// 각 블럭이 끝나는 지점에 주석 습관화 하자!
		//ex) outter if, inner if
		
		
	}
}
