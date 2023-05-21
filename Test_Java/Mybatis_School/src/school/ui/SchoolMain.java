package school.ui;

import school.dao.SchoolDAO;
import school.vo.Student;

/**
 * 성적 처리 프로그램의 시작
 */
public class SchoolMain {

	public static void main(String[] args) {
		SchoolDAO dao = new SchoolDAO();
		
		new SchoolUI();
	}
}
