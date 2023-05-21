package board.dao;

import java.util.ArrayList;

import board.vo.Board;
import board.vo.Member;

//xml�� sql������ ���εǴ� �������̽�
public interface BoardMapper {

	int insertMember(Member m);

	Member getMember(String id);

	void insertBoard(Board b);

	ArrayList<Board> getList();

	Board searchNum(String num);

	ArrayList<Board> searchContents(String cont);

	int delete(Board b);

	int updateBoard(Board p);

}
