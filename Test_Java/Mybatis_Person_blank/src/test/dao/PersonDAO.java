package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

/**
 * DB관련 처리 클래스
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//회원정보 저장
	public void insertPerson(Person p) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			mapper.insertPerson(p);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
	}
	//회원정보 삭제
	public int deletePerson(int n) {
		SqlSession ss = null;
		int cnt = 0;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			cnt = mapper.deletePerson(n);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	//회원정보 수정
	public int updatePerson(Person p) {
		SqlSession ss = null;				//
		int cnt = 0;
		
		try {
			ss = factory.openSession();		//트랜젝션 하나를 (SqlSession으로)열어줌
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			cnt = mapper.updatePerson(p);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return cnt;
	}
	//한 명의 정보 조회
	public Person selectOne(int num) {
		Person p = null;
		
		SqlSession s = factory.openSession();
		PersonMapper m = s.getMapper(PersonMapper.class);
		p = m.selectOne(num);
		s.close();
		//try catch는 해주는게 더 좋긴 함...
		return p;
	}
	//전체 조회
		public ArrayList<Person> selectALL() {
			ArrayList<Person> list = null;
			
			SqlSession s = factory.openSession();
			PersonMapper m = s.getMapper(PersonMapper.class);
			list = m.selectALL();
			s.close();
			//try catch는 해주는게 더 좋긴 함...
			return list;
		}
		//이름으로 조회
		public ArrayList<Person> selectName(String name) {
			ArrayList<Person> list = null;
			
			SqlSession s = factory.openSession();
			PersonMapper m = s.getMapper(PersonMapper.class);
			list = m.selectName(name);
			s.close();
			//try catch는 해주는게 더 좋긴 함...
			return list;
		}
	
}
