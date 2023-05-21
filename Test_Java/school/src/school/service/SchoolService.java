package school.service;

import java.util.ArrayList;

import school.dao.SchoolDAO;
import school.vo.Student;

public class SchoolService {
	SchoolDAO dao = new SchoolDAO();
	
	public void inputStudent(Student s) {
		dao.insert(s);
	}

	public ArrayList<Student> getList() {
		ArrayList<Student> studentList = dao.getList();
		return studentList;
	}
	public boolean deleteStudent(String s)
	{
		return dao.delete(s);
	}
	
	public ArrayList<String> Search(String s)
	{
		ArrayList<Student> searchListF = dao.search(s);
		ArrayList<String> searchList = new ArrayList<>();
		for(int i = 0; i<searchListF.size(); i++)
		{
			String a = searchListF.get(i).getName();
			String b = searchListF.get(i).getId();
			String c = searchListF.get(i).getPhone();
			double dnum = searchListF.get(i).getAverage();
			searchList.add("이름: "+a+", 학번: "+b+", 전화번호: "+c+", 평점: "+dnum+"\n");
		}
		
		return searchList;
	}

	public void save() {
		dao.save();
	}
		
}
