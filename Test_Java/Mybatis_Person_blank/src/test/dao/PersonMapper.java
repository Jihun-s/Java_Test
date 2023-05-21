package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface PersonMapper {
	//Person��ü ����
	public int insertPerson(Person p);
	//����
	public int deletePerson(int n);
	//����
	public int updatePerson(Person p);
	//1�� ��ȸ
	public Person selectOne(int n);
	//������ ��ȸ
	public ArrayList<Person> selectALL();
	//�̸����� ��ȸ
	public ArrayList<Person> selectName(String name);
}
