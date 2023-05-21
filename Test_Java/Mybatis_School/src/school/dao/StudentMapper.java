package school.dao;

import java.util.ArrayList;

import school.vo.Student;

public interface StudentMapper {
	
	public void insert(Student s);

	public ArrayList<Student> getList();

	public ArrayList<Student> searchName(String name);

	public int delete(String id);
	
}
