package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.dao.BoardDAO;
import board.service.BoardService;
import board.vo.Board;
import board.vo.Member;

//사용자 인터페이스
public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardService service = new BoardService();
	String loginId;			//로그인 여부. 아이디/null
	
	public BoardUI() {
		String choice;
		while(true){
			menu();
			choice = keyin.nextLine();
			switch(choice) {
			case "1": join();break;
			case "2": login();break;
			case "3": logout();break;
			case "4": write();break;
			case "5": list();break;
			case "6": read();break;
			case "7": search();break;
			case "8": delete();break;
			case "9": update();break;
			case "0": exit();return;
			default:
				System.out.println("++++++선택 오류++++++");
			}
		}
	}


	//메뉴 출력
	void menu() {
		System.out.println("[ 사용자 게시판 ]");
		
		if(this.loginId == null) {
			System.out.println("1. 가입");
			System.out.println("2. 로그인");
		}else {
			System.out.println("3. 로그아웃");
			System.out.println("4. 글쓰기");
			System.out.println("5. 글목록");
			System.out.println("6. 글읽기");
			System.out.println("7. 검색");
			System.out.println("8. 삭제");
			System.out.println("9. 수정");
			
		}
		System.out.println("0. 종료");
		System.out.print("선택>");
	}
	
	//글 쓰기
	void write() {
		if(loginId == null) return;
		//글 제목, 내용 입력받아 DB에 저장
		System.out.println("[ 글쓰기 ]");
		System.out.println("제목:");
		String title = keyin.nextLine();
		System.out.println("본문:");
		String contents = keyin.nextLine();
		
		Board board = new Board();
		board.setTitle(title);
		board.setContents(contents);
		board.setId(loginId);
		
		service.write(board);
		System.out.println("저장되었습니다.");
		
	}
	
	//가입
	void join() {
		System.out.println("가입");
		System.out.print("ID: ");
		String id = keyin.nextLine();
		Member t = new Member(id, "", "");
		if(service.idCheck(t)) {}
		else{
			System.out.println("이미 있는 아이디입니다.");
			this.join();
		}
		System.out.print("Password: ");
		String password = keyin.nextLine();
		System.out.print("이름: ");
		String name = keyin.nextLine();
		
		Member m = new Member(id, name, password);
		int cnt = service.join(m);
		if(cnt ==1){
			System.out.println("가입 완료되었습니다.");
			return;
		}else
			System.out.println("가입 실패");
	}
	
	//로그인
	void login() {
		System.out.println("로그인");
		System.out.print("ID: ");
		String id = keyin.nextLine();
		System.out.print("Password: ");
		String password = keyin.nextLine();
		
		Member m = new Member();
		m.setId(id);
		m.setPassword(password);
		
		if(service.login(m)) {
			this.loginId = id;
			System.out.println(m.getId()+"님 로그인 중");
		}else {
			System.out.println("ID 또는 비밀번호가 틀립니다.");
		}
	}
	
	//로그아웃
	void logout() {
		if(loginId == null) return;
		System.out.println("로그아웃 되었습니다.");
		this.loginId = null;
	}
	
	//글 목록 조회
	private void list() {
		if(loginId == null) return;
		System.out.println("[글 목록 출력 ]");
		ArrayList<Board> boardList = service.getList();
		for(Board b: boardList)
		{
			System.out.println(b.getNum()+" : [작성자]..("+b.getName()+") [제목]..("+b.getTitle()+") [작성일]..("+b.getInputdate()+")");
		}
	}
	//글 읽기
	//6. 글 읽기 - 글 번호를 입력받아서 해당 글 내용을 출력
	//(없는 번호(NULL)에는 없는 번호입니다.)출력
	private Board read() {
		if(loginId == null) return null;
		System.out.print("글 번호:");
		String num = keyin.nextLine();
		Board s = service.Search(num);
		
		if(s == null)
		{
			System.out.println("검색 결과가 없습니다.");
		}
		else 
		{
			System.out.println(s.getNum()+": "+s.getTitle());
			System.out.println(s.getContents());
		}
		return s;
	}
	//검색
	//7. 검색 - 단어를 입력받아 제목이나 본문에 포함되어 있는 글 출력(대소문자 무시)
	private void search() {
		if(loginId == null) return;
		System.out.println("내용 입력 : ");
		String cont = keyin.nextLine();
		ArrayList<Board> contents = service.SearchCont(cont);
		
		if(contents.isEmpty())
		{
			System.out.println("검색 결과가 없습니다.");
		}
		else 
		{
			for(Board s: contents)
			{
				System.out.println(s.getNum()+": "+s.getTitle());
				System.out.println(s.getContents()+"\n");
			}
		}
	}
	
	//삭제 - 글 번호를 입력받아서 삭제(로그인id가 일치할 경우)
	private void delete() {
		if(loginId == null) return;
		System.out.print("삭제할 글 번호 입력:");
		int num = 0;
		try {
			num = Integer.parseInt(keyin.nextLine());
		}
		catch (Exception e) {
			System.out.println("번호를 숫자로 입력하세요.");
			return;
		}
		Board b = new Board();
		b.setNum(num);
		b.setId(loginId);
		int n = service.delete(b);	
		if (n == 0) {
			System.out.println("해당 번호의 글이 없습니다.");
		}
		else {
			System.out.println("삭제되었습니다.");
		}
	}
	
	//9. 수정 - 글번호를 입력받음 -> 해당 글 출력 -> 제목/내용 입력받아서 수정
	//(본인 로그인 id가 일치할 경우)
	private void update() {
		Board m = read();
		if(!(m.getId().equals(loginId)))
		{
			System.out.println("본인이 게시한 글만 수정 가능합니다.");
			return;
		}
		System.out.print("새 제목 입력:");
		String newtitle = keyin.nextLine();
		System.out.print("글 내용 입력:");
		String newcont = keyin.nextLine();
		m.setTitle(newtitle);
		m.setContents(newcont);
		int n = service.update(m);
		System.out.println(n + "건 수정 완료");
		
	}
	
	//프로그램 종료
	void exit() {
		System.out.println("종료하였습니다.");
	}
}
