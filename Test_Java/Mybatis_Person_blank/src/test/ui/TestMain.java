package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		Scanner sc = new Scanner(System.in);

		
//---�Է�
//		Person pe;
//		pe = new Person("��ö��", 30);
//		dao.insertPerson(pe);
		
//---����
//		int n = 1;
//		if(dao.deletePerson(n)==0)
//		{
//			System.out.println(n+"�� ȸ���� �����ϴ�.");
//		}else {
//			System.out.println("�����Ǿ����ϴ�.");
//		}
		
//---����
//		Person p = new Person(2, "��ö��", 40);
//		int n = dao.updatePerson(p);
//		System.out.println(n + "�� ���� �Ϸ�");
		
//---1�� ��ȸ(���޵� ��ȣ�� �ش��ϴ� ȸ�������� Person ��ü�� ����)
//		Person p = dao.selectOne(2);
//		System.out.println(p);
		
//---��ü ��ȸ
//		ArrayList<Person> a = dao.selectALL();
//		for(Person p:a)
//		{
//			System.out.println(p);
//		}
//---�̸����� �˻�
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		//Ű����� ���ڿ� �Է�
		ArrayList<Person> a = dao.selectName(name);
		for(Person p:a)
		{
			System.out.println(p);
		}
		//�� ���ڿ��� ���Ե� ȸ���˻�
		
		
	}
}
