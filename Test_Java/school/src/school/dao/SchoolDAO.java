package school.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import school.vo.Student;


//클래스 디자인 템플릿 공부해보자. 해당 클래스에는 객체가 한개만 존재해야 한다는 조건 등을 세우는 방법(현재 배운 코드들로 구현 가능) 공부해보자.

public class SchoolDAO {
	ArrayList<Student> list;	//학생 정보 저장 리스트
	static final String FILENAME = "school.sch";
	
	public SchoolDAO() {
		//school.sch 파일을 연다(객체 단위로 읽을 수 있게)
		//파일이 없으면 ArrayList 생성
		//파일이 있으면 저장된 ArrayList객체를 읽어서 list에 대입;
		try {//school.sch 연다
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME));
			list = (ArrayList<Student>) in.readObject();			//readObect - Object 타입으로 와서 형변환 필요함.
			in.close();
		}
		catch(Exception e) {
			//ArrayList 생성
			list = new ArrayList<Student>();
		}
	}
		
	public void save() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME));
			out.writeObject(list);
			out.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		//school.sch 파일을 생성
		//파일에 list 저장
	}
	
	public void insert(Student s) {
		list.add(s);
	}
	public ArrayList<Student> getList() {
		return list;
	}
	
	public boolean delete(String id) {
		for(int i =0; i<list.size(); i++)
		{
			if(list.get(i).getId().equals(id))
			{
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Student> search(String name) {
		ArrayList<Student> result = new ArrayList<>();
		for(Student s : list)
		{
			if(s.getName().contains(name))
			{
				result.add(s);//list.get(i) == s
			}
		}
		return result;
	}
}		
		
		
		//[dao에서 해야할 일]
		//1. String으로 이름의 일부분을 전달받는다
		//2. 새로운 ArrayList<Student> 객체를 생성한다.
		//0부터 마지막 index까지 기존 ArrayList내의 Student객체를 읽는다
		//각 학생의 이름과 전달받은 문자열을 비교 (한명이 아니라 여러명이 나올 수 있음)
		//이름의 일부분이 일치하면 그 Student 객체를 새로만든 ArrayList에 저장 <- 이거 리턴하셈
		// - 반복.
		
		//학번검색/ 기준 이상의 학생들 검색
	

