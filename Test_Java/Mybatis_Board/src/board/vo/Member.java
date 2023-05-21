package board.vo;
//회원정보 VO
public class Member {
	String id;		//회원ID
	String password;//비밀번호
	String name;	//회원이름
	//생성자
	public Member() {
	}
	
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	//게터..세터..//
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//toString 오버라이드
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
