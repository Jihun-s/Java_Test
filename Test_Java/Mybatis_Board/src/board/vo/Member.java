package board.vo;
//ȸ������ VO
public class Member {
	String id;		//ȸ��ID
	String password;//��й�ȣ
	String name;	//ȸ���̸�
	//������
	public Member() {
	}
	
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	//����..����..//
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
	//toString �������̵�
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
