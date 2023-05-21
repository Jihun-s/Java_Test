package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;

		while(true)
		{
			System.out.println("국어점수 입력: ");
			try {
				score = sc.nextInt();
				if(score<0 || score>100)
				{
					throw new ScoreException();
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자로 입력하세요.");
				sc.nextLine();
				continue;
			}catch(ScoreException e)
			{
				System.out.println("점수는 0~100 이내입니다.");
				e.printStackTrace();
				continue;
			}
			break;
		}
		System.out.println(score);
	}

}
