package api;

import java.util.Scanner;

public class IntegerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력할 진법 선택
        System.out.print("입력할 진법(2/8/10/16): ");
        int inputBase = sc.nextInt();
        
        if(inputBase != 2 &&inputBase != 8 &&inputBase != 10 &&inputBase != 16)
        {
        	System.out.println("입력 오류");
        	return;
        }
        
        // n진수의 정수 입력
        System.out.printf("정수 입력(%d진수): ", inputBase);
        String num = sc.next();
        
        // 변환할 진법 선택
        System.out.print("변환할 진법(2/8/10/16): ");
        int base = sc.nextInt();
        
        if(base != 2 &&base != 8 &&base != 10 &&base != 16)
        {
        	System.out.println("입력 오류");
        	return;
        }
        
        int decimalNum = Integer.parseInt(num, inputBase);	//(수, 수의 진법)
        
        // 10진수를 선택한 진법으로 변환
        String result = Integer.toString(decimalNum, base).toUpperCase();
        
        // 결과 출력
        System.out.printf("%s(%d) -> %s(%d)",num, inputBase, result, base);
        System.out.printf("\n%d, %s", decimalNum, result);
	}
}

//입력할 진법(2/8/10/16) : 2 - 숫자로 입력받음
//정수 입력(2진수) : 11111111 - 문자열로 입력받음
//변환할 진법(2/8/10/16): 16 - 
//255(2) -> FF(16)

//int num = 10;		//10진수
//int bnum = 0B1010;	//2진수
//int onum = 012;		//8진수
//int xnum = 0XA;		//16진수