package school.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import school.vo.Student;
import school.dao.StudentMapper;
import school.dao.MybatisConfig;


//클래스 디자인 템플릿 공부해보자. 해당 클래스에는 객체가 한개만 존재해야 한다는 조건 등을 세우는 방법(현재 배운 코드들로 구현 가능) 공부해보자.

public class SchoolDAO {
	ArrayList<Student> list;	//학생 정보 저장 리스트
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//학생등록
	public void insert(Student s) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession();
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			mapper.insert(s);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
	}
	//전체목록 출력
	public ArrayList<Student> getList() {
		ArrayList<Student> list = null;
		
		SqlSession s = factory.openSession();
		StudentMapper m = s.getMapper(StudentMapper.class);
		list = m.getList();
		s.close();
		//try catch는 해주는게 더 좋긴 함...
		return list;
	}
	
	//학번입력 삭제
	public boolean delete(String id) {
		SqlSession ss = null;
		int cnt = 0;
		boolean result = true;
		try {
			ss = factory.openSession();
			StudentMapper mapper = ss.getMapper(StudentMapper.class);
			cnt = mapper.delete(id);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		if(cnt == 0)
		{
			result = false;
		}
		
		return result;
	}
	
	
	//이름으로 조회
	public ArrayList<Student> searchName(String name) {
		ArrayList<Student> list = null;
		
		SqlSession s = factory.openSession();
		StudentMapper m = s.getMapper(StudentMapper.class);
		list = m.searchName(name);
		s.close();
		//try catch는 해주는게 더 좋긴 함...
		return list;
	}
	
	public void save() {
		// TODO Auto-generated method stub
		
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
	

