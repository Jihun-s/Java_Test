package board.service;

import java.util.ArrayList;

import board.dao.BoardDAO;
import board.vo.Board;
import board.vo.Member;

//��� ����
public class BoardService {
	BoardDAO dao = new BoardDAO();
	//����
	public int join(Member m) {
		return dao.insertMember(m);
	}
	//�α���
	public boolean login(Member m) {
		Member result = dao.getMember(m.getId());
		if(result !=null&& result.getPassword().equals(m.getPassword()))
			return true;
		else return false;
	}
	//�۾���
	public void write(Board b) {
		dao.insertBoard(b);
	}
	//�۸��
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
	//����
	public int delete(Board b) {
		return dao.delete(b);
	}
	//����
	public int update(Board m) {
		return dao.updateBoard(m);
	}
}