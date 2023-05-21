package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.dao.BoardDAO;
import board.service.BoardService;
import board.vo.Board;
import board.vo.Member;

//����� �������̽�
public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardService service = new BoardService();
	String loginId;			//�α��� ����. ���̵�/null
	
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
				System.out.println("++++++���� ����++++++");
			}
		}
	}


	//�޴� ���
	void menu() {
		System.out.println("[ ����� �Խ��� ]");
		
		if(this.loginId == null) {
			System.out.println("1. ����");
			System.out.println("2. �α���");
		}else {
			System.out.println("3. �α׾ƿ�");
			System.out.println("4. �۾���");
			System.out.println("5. �۸��");
			System.out.println("6. ���б�");
			System.out.println("7. �˻�");
			System.out.println("8. ����");
			System.out.println("9. ����");
			
		}
		System.out.println("0. ����");
		System.out.print("����>");
	}
	
	//�� ����
	void write() {
		if(loginId == null) return;
		//�� ����, ���� �Է¹޾� DB�� ����
		System.out.println("[ �۾��� ]");
		System.out.println("����:");
		String title = keyin.nextLine();
		System.out.println("����:");
		String contents = keyin.nextLine();
		
		Board board = new Board();
		board.setTitle(title);
		board.setContents(contents);
		board.setId(loginId);
		
		service.write(board);
		System.out.println("����Ǿ����ϴ�.");
		
	}
	
	//����
	void join() {
		System.out.println("����");
		System.out.print("ID: ");
		String id = keyin.nextLine();
		Member t = new Member(id, "", "");
		if(service.idCheck(t)) {}
		else{
			System.out.println("�̹� �ִ� ���̵��Դϴ�.");
			this.join();
		}
		System.out.print("Password: ");
		String password = keyin.nextLine();
		System.out.print("�̸�: ");
		String name = keyin.nextLine();
		
		Member m = new Member(id, name, password);
		int cnt = service.join(m);
		if(cnt ==1){
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			return;
		}else
			System.out.println("���� ����");
	}
	
	//�α���
	void login() {
		System.out.println("�α���");
		System.out.print("ID: ");
		String id = keyin.nextLine();
		System.out.print("Password: ");
		String password = keyin.nextLine();
		
		Member m = new Member();
		m.setId(id);
		m.setPassword(password);
		
		if(service.login(m)) {
			this.loginId = id;
			System.out.println(m.getId()+"�� �α��� ��");
		}else {
			System.out.println("ID �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}
	
	//�α׾ƿ�
	void logout() {
		if(loginId == null) return;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		this.loginId = null;
	}
	
	//�� ��� ��ȸ
	private void list() {
		if(loginId == null) return;
		System.out.println("[�� ��� ��� ]");
		ArrayList<Board> boardList = service.getList();
		for(Board b: boardList)
		{
			System.out.println(b.getNum()+" : [�ۼ���]..("+b.getName()+") [����]..("+b.getTitle()+") [�ۼ���]..("+b.getInputdate()+")");
		}
	}
	//�� �б�
	//6. �� �б� - �� ��ȣ�� �Է¹޾Ƽ� �ش� �� ������ ���
	//(���� ��ȣ(NULL)���� ���� ��ȣ�Դϴ�.)���
	private Board read() {
		if(loginId == null) return null;
		System.out.print("�� ��ȣ:");
		String num = keyin.nextLine();
		Board s = service.Search(num);
		
		if(s == null)
		{
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else 
		{
			System.out.println(s.getNum()+": "+s.getTitle());
			System.out.println(s.getContents());
		}
		return s;
	}
	//�˻�
	//7. �˻� - �ܾ �Է¹޾� �����̳� ������ ���ԵǾ� �ִ� �� ���(��ҹ��� ����)
	private void search() {
		if(loginId == null) return;
		System.out.println("���� �Է� : ");
		String cont = keyin.nextLine();
		ArrayList<Board> contents = service.SearchCont(cont);
		
		if(contents.isEmpty())
		{
			System.out.println("�˻� ����� �����ϴ�.");
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
	
	//���� - �� ��ȣ�� �Է¹޾Ƽ� ����(�α���id�� ��ġ�� ���)
	private void delete() {
		if(loginId == null) return;
		System.out.print("������ �� ��ȣ �Է�:");
		int num = 0;
		try {
			num = Integer.parseInt(keyin.nextLine());
		}
		catch (Exception e) {
			System.out.println("��ȣ�� ���ڷ� �Է��ϼ���.");
			return;
		}
		Board b = new Board();
		b.setNum(num);
		b.setId(loginId);
		int n = service.delete(b);	
		if (n == 0) {
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}
		else {
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	
	//9. ���� - �۹�ȣ�� �Է¹��� -> �ش� �� ��� -> ����/���� �Է¹޾Ƽ� ����
	//(���� �α��� id�� ��ġ�� ���)
	private void update() {
		Board m = read();
		if(!(m.getId().equals(loginId)))
		{
			System.out.println("������ �Խ��� �۸� ���� �����մϴ�.");
			return;
		}
		System.out.print("�� ���� �Է�:");
		String newtitle = keyin.nextLine();
		System.out.print("�� ���� �Է�:");
		String newcont = keyin.nextLine();
		m.setTitle(newtitle);
		m.setContents(newcont);
		int n = service.update(m);
		System.out.println(n + "�� ���� �Ϸ�");
		
	}
	
	//���α׷� ����
	void exit() {
		System.out.println("�����Ͽ����ϴ�.");
	}
}