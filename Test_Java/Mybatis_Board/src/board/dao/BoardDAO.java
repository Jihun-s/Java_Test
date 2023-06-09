package board.dao;
//데이터 처리

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;
import board.vo.Member;
import board.dao.BoardMapper;

public class BoardDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	//가입
	public int insertMember(Member m){
		SqlSession ss = null;
		int cnt = 0;
		//트랜잭션 시작
		//매퍼 인터페이스의 메소드 호출
		//커밋
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			cnt = mapper.insertMember(m);
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
	//로그인 - db에서 정보를 가져온다.
	public Member getMember(String id) {
		Member m = null;
		
		SqlSession s = factory.openSession();
		BoardMapper mapper = s.getMapper(BoardMapper.class);
		m = mapper.getMember(id);
		s.close();
		return m;
	}
	public Board insertBoard(Board b) {
		
		SqlSession s = factory.openSession();
		BoardMapper mapper = s.getMapper(BoardMapper.class);
		mapper.insertBoard(b);
		s.commit();
		s.close();
		return b;
	}
	public ArrayList<Board> getList() {
		ArrayList<Board> list = new ArrayList<Board>();
		
		SqlSession s = factory.openSession();
		BoardMapper mapper = s.getMapper(BoardMapper.class);
		list = mapper.getList();
		s.close();
		return list;
	}
	public Board searchNum(String num) {
		Board b = null;
		
		SqlSession s = factory.openSession();
		BoardMapper mapper = s.getMapper(BoardMapper.class);
		b = mapper.searchNum(num);
		s.close();
		return b;
	}
	public ArrayList<Board> searchContents(String cont) {
		ArrayList<Board> list = null;
		
		SqlSession s = factory.openSession();
		BoardMapper mapper = s.getMapper(BoardMapper.class);
		list = mapper.searchContents(cont);
		s.close();
		return list;
	}
	//삭제
	public int delete(Board b) {
		SqlSession ss = null;
		int cnt = 0;
		boolean result = true;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			cnt = mapper.delete(b);
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
	public int updateBoard(Board m) {
		SqlSession ss = null;				//
		int cnt = 0;
		
		try {
			ss = factory.openSession();		//트랜젝션 하나를 (SqlSession으로)열어줌
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			cnt = mapper.updateBoard(m);
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
}
