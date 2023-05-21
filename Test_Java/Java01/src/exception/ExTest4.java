package exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  ArrayList<Integer> numlist = new ArrayList<Integer>();
	        int sum = 0;
	        try {
	            while (true) {
	            	System.out.print("정수 입력: ");
	                int num = scanner.nextInt();
	                numlist.add(Integer.valueOf(num));
	                sum += num;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("---------------------------");
	            for(int i = 0; i<numlist.size(); i++)
	            {
	            	System.out.print(numlist.get(i));
	            	if(i != numlist.size()-1)
	            	{
	            		System.out.print(" + ");
	            	}
	            }
	            System.out.print(" = "+sum);
	            return;
	        }
	}
}

//2
//5
//10
//3
//x
//----
//2++10+3=20   -   반복입력. 숫자가 아닌게 오면 출력