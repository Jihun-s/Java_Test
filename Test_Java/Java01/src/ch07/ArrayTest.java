package ch07;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		// new int[]라고 추기화는 굳이 할 필요는 없다.
		int n = 4;
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		for(int i:num) {
			System.out.print(i);
		}
		int[] subarr = Arrays.copyOfRange(num, 0, n + 1);
		System.out.println(Arrays.toString(subarr));
		
	}

}
