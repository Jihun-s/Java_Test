package api;

public class Data {
	int num;
	String name;
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data)
		{
			Data d = (Data)obj;		//데이터 타입 형변환!!!
			if(this.num == d.num&& this.name.equals(d.name))
			{
				return true;
			}else
			{
				return false;
			}
		}else
			{
				return false;
			}//Data가 아니면 false
	}

	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
