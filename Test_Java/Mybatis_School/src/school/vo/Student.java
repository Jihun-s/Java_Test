package school.vo;

import school.vo.Person;

public class Student extends Person 
{
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	public Student() 
	{
		super();
	}
	
	public Student(String name, String id, String phone, int kor, int eng, int mat) 
	{
		super(name, id, phone);
//		setName(name);
//		setId(id);
//		setPhone(phone);
		this.kor =kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getTotal() 
	{
		int Total = kor+eng+mat;
		return Total;
	}
	public double getAverage() 
	{
		double t = getTotal()/3.0;
		return t;
	}
	
	public String getGrade() 
	{
//		double d = getAverage();
//		String s = "F";
//		if(d>=90) {
//			return s = "A";
//		}else if(d>=80) {
//			return s = "B";
//		}else if(d>=70) {
//			return s = "C";
//		}else if(d>=60) {
//			return s = "D";
//		}else return s = "F";
		String s = null;
		switch((int)getAverage()/10) 
		{	
			case 10:
			case 9: s = "A";break;
			case 8: s = "B";break;
			case 7: s = "C";break;
			case 6: s = "D";break;
			default: s = "F";break;
		}
		return s;
	}
	
	public int getKor() 
	{
		return kor;
	}
	
	public void setKor(int kor) 
	{
		this.kor = kor;
	}
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		this.eng = eng;
	}
	public int getMat() 
	{
		return mat;
	}
	public void setMat(int mat) 
	{
		this.mat = mat;
	}
	@Override
	public String toString()
	{	
		String s = super.toString();
		String b = "\n국어:" + this.kor + " 영어:" + this.eng + "  수학:" + this.mat +"\n";
		return s+b;
	}
}