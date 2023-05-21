package ch05;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}
	
	public void setMyDate(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public boolean isValid() {
		boolean isValid;
		int maxDays = 0;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			maxDays = 30;
			break;
		case 2:
			maxDays = ((year % 4 ==0 && year % 100 != 0)|| year % 400 == 0)? 29:28;
			break;
		default: System.out.println("월은 1~12로 입력하세요.");
	}
		if(maxDays>=day&&day>0&&12>=month&&month>0&&year>0) {
			isValid = true;
		}else {
			isValid = false;
			System.out.println("일 입력 오류!");
		}
		return isValid;
		
	}
	
	
	//private에 수정하는 방법 (타 클래스의 경우)
	
}
