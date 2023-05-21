package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

/**
 * DB���� ó�� Ŭ����
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
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
	//ȸ������ ����
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
	//ȸ������ ����
	public int updatePerson(Person p) {
		SqlSession ss = null;				//
		int cnt = 0;
		
		try {
			ss = factory.openSession();		//Ʈ������ �ϳ��� (SqlSession����)������
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
	//�� ���� ���� ��ȸ
	public Person selectOne(int num) {
		Person p = null;
		
		SqlSession s = factory.openSession();
		PersonMapper m = s.getMapper(PersonMapper.class);
		p = m.selectOne(num);
		s.close();
		//try catch�� ���ִ°� �� ���� ��...
		return p;
	}
	//��ü ��ȸ
		public ArrayList<Person> selectALL() {
			ArrayList<Person> list = null;
			
			SqlSession s = factory.openSession();
			PersonMapper m = s.getMapper(PersonMapper.class);
			list = m.selectALL();
			s.close();
			//try catch�� ���ִ°� �� ���� ��...
			return list;
		}
		//�̸����� ��ȸ
		public ArrayList<Person> selectName(String name) {
			ArrayList<Person> list = null;
			
			SqlSession s = factory.openSession();
			PersonMapper m = s.getMapper(PersonMapper.class);
			list = m.selectName(name);
			s.close();
			//try catch�� ���ִ°� �� ���� ��...
			return list;
		}
	
}
