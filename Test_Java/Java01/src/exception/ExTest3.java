package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest3 {

	public static void main(String[] args) {
		int num[] = new int[5];
		//키보드로 정수 5개를 입력받아 배열 num에 저장
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length;)
		{	
			try {
				num[i] = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("다시 입력");
				sc.nextLine();
				continue;
			}
			i++;
		}
		for(int i:num){
			System.out.print(i + " ");
		}
		
		//배열에 저장된 값 5개를 출력
	}

}
