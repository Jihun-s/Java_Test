package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface PersonMapper {
	//Person객체 저장
	public int insertPerson(Person p);
	//삭제
	public int deletePerson(int n);
	//수정
	public int updatePerson(Person p);
	//1명 조회
	public Person selectOne(int n);
	//여러명 조회
	public ArrayList<Person> selectALL();
	//이름으로 조회
	public ArrayList<Person> selectName(String name);
}
