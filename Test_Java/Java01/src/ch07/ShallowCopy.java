package ch07;

public class ShallowCopy {//얕은 복사 (

	public static void main(String[] args) {
		int num1[] = {10,20,30,40,50};
		int num2[] = num1; //이 곳만 다름(깊은 복사랑)
		
		num2[0]=1;
		
		System.out.println("=== num1 ===");
		for(int i:num1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("=== num2 ===");
		for(int i:num2) {
			System.out.print(i+" ");
		}
	}

}
