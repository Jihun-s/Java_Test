package board.service;

import java.util.ArrayList;

import board.dao.BoardDAO;
import board.vo.Board;
import board.vo.Member;

//기능 구현
public class BoardService {
	BoardDAO dao = new BoardDAO();
	//가입
	public int join(Member m) {
		return dao.insertMember(m);
	}
	//로그인
	public boolean login(Member m) {
		Member result = dao.getMember(m.getId());
		if(result !=null&& result.getPassword().equals(m.getPassword()))
			return true;
		else return false;
	}
	//글쓰기
	public void write(Board b) {
		dao.insertBoard(b);
	}
	//글목록
	public ArrayList<Board> getList() {
		ArrayList<Board> boardList = dao.getList();
		return boardList;
	}
	//idCheck
	public boolean idCheck(Member m){
		Member result = dao.getMember(m.getId());
		if(result ==null)
			return true;
		else return false;
	}
	//Search Num
	public Board Search(String num) {
		Board searchList = dao.searchNum(num);
		return searchList;
	}
	//Search Contents
	public ArrayList<Board> SearchCont(String cont) {
		ArrayList<Board> searchList = dao.searchContents(cont);
		return searchList;
	}
	//삭제
	public int delete(Board b) {
		return dao.delete(b);
	}
	//수정
	public int update(Board m) {
		return dao.updateBoard(m);
	}
}
