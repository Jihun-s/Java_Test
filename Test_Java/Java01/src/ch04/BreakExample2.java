package ch04;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0;;num++) {
			sum +=num;
			if(sum>=100)
				break;
		}
		System.out.printf("num : %d\n",num);
		System.out.printf("sum : %d",sum);
	}

}
