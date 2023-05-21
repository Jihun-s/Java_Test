package ch03.test;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		int total; double avg;
		total = kor+eng+mat;
		avg = (double)total/3; //Or eve = total/3.0
		System.out.printf("총점 : %d 평균 : %.2f", total, avg);
	}

}
