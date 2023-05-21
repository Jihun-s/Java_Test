package ch07;

public class DeepCopy {//깊은 복사 (원 배열이랑 주솟값이 다르게 복사됨)

	public static void main(String[] args) {
		int num1[] = {10,20,30,40,50};
		int num2[] = new int[num1.length];
		
		System.arraycopy(num1, 0, num2, 0, num1.length); //(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수)
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
