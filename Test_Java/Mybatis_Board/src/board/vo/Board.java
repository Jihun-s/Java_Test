package board.vo;
//�Խñ� ���� VO
public class Board {
	private int num;			//�� ��ȣ
	private String id;			//�ۼ��� ID
	private String name;		//�ۼ��� �̸�	--foreign key
	private String title;		//�� ����
	private String contents;	//�� ���� ����
	private String inputdate;	//�ۼ��ð�
	//������
	//getters, setters
	//toString()		�� ������ �ʼ�
	
	//������
	public Board() {
	}
	public Board(int num, String id, String title, String contents) {
		this.num = num;
		this.id = id;
		this.name = name;
		this.title = title;
		this.contents = contents;
		this.inputdate = inputdate;
	}
	//����..����..//
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", id=" + id + ", name=" + name + ", title=" + title + ", contents=" + contents
				+ ", inputdate=" + inputdate + "]";
	}
}
