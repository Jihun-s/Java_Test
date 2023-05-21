package board.vo;
//게시글 정보 VO
public class Board {
	private int num;			//글 번호
	private String id;			//작성자 ID
	private String name;		//작성자 이름	--foreign key
	private String title;		//글 제목
	private String contents;	//글 본문 내용
	private String inputdate;	//작성시간
	//생성자
	//getters, setters
	//toString()		이 세개는 필수
	
	//생성자
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
	//게터..세터..//
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
