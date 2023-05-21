package api;
import java.util.ArrayList;
import java.util.Scanner;
import school.Student;
public class SchoolTest1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		Student s;
		//학생정보를 반복적으로 입력받아 저장
		boolean k = true;
		while(k)
		{
			//학생의 이름, 학번, 전화번호, 국 영 수 점수를 입력받아 Student객체 타입으로 ArrayList에 저장
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("주민번호: ");
			String id = sc.next();
			System.out.print("전화번호: ");
			String phone = sc.next();
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			System.out.print("수학점수: ");
			int mat = sc.nextInt();
			s = new Student(name, id, phone, kor, eng, mat);
			list.add(s);
			
			System.out.println("계속 입력하시겠습니까? (y/n)");
			String a = sc.next();
			if(a.equals("y"))
			{
				continue;
			}
			else if(a.equals("n"))
			{
				System.out.println(list);
				k = false; break;
			}//모든 학생 정보 출력
			else
			{
				while(true)
				{
					System.out.println("(y/n)으로 입력해주세요!");
					a = sc.next();
					if(a.equals("y"))
					{
						break;
					}
					else if(a.equals("n"))
					{
						System.out.println(list);
						k = false; break;
					}
				}
			}
		}
		// 모든 학생의 "학번 이름 총점 평균" 형식으로 출력
		for(int i = 0; i<list.size(); i++)
		{
			Student a = list.get(i);
			System.out.printf("%d - 학번: %s, 이름: %s, 총점: %d, 평균: %f\n",i+1,a.getId(),
					a.getName(), a.getTotal(), a.getAverage());
			
		}
		for(Student a :list)
		{
			System.out.println(a.getName() +"\t"+ a.getId() +"\t"+ a.getTotal() +"\t"+ a.getAverage());
		}
		//전체학생의 평균 점수?
		double sum =0.0;
		for(Student a :list)
		{
			sum += a.getAverage();
		}System.out.println(sum/list.size());
	}
}
