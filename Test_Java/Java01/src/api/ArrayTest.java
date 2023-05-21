package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[]= new int[3];
		int i = 0, n = 0;

		while(true)
		{
			int num1[]= new int[i<<1];
			System.out.print("정수입력:");
			n = sc.nextInt();
			if(n == -1)break;
			
			if(i == num.length)
			{
				num1 = num;
				num = new int[i<<1];
				
				for(int j = 0; j<i; j++)
				{
					num[j] = num1[j];
				}//num에 임시num1값 대입
			}
			num[i] = n;
			i++;
		}
		//정수를 반복 입력받아 배열을 초기화
		//배열이 다 차면 새로운 배열을 생성해서 데이터 이동. 기존 배열은 버림.
		//-1입력시 반복종료
		System.out.print("[ ");
		for(i=0; i<num.length; i++)
		{
			System.out.print(num[i]);
			if(i<num.length-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		//배열에 저장돤 값들을 출력
		
		ArrayList<Integer> anum = new ArrayList<>();
		
		while(true)
		{
			System.out.print("정수입력:");
			n = sc.nextInt();
			if(n == -1)
			{
				System.out.print(anum);
				break;
			}
			anum.add(new Integer(n));
						
		}	
	}
}
