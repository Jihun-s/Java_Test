package api;

import java.util.Calendar;

//Calendar 클래스
public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();	//new로 생성자 생성 불가능한 예외!
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
//		String day = "";
//		switch(c.get(Calendar.DAY_OF_WEEK);)
//		{
//			case Calendar.SUNDAY: 	day = "일";
//			case Calendar.MONDAY: 	day = "월";
//			case Calendar.TUESDAY: 	day = "화";
//			case Calendar.WEDNESDAY:day = "수";
//			case Calendar.THURSDAY: day = "목";
//			case Calendar.FRIDAY: 	day = "금";
//			case Calendar.SATURDAY: day = "토";
//		}
		
		String dayow[] = {"일", "월", "화", "수", "목", "금", "토"};
		String day = dayow[c.get(Calendar.DAY_OF_WEEK)-1];
		
		
		int ampm = c.get(Calendar.AM_PM);
		String ampmS = "";
		if(ampm == Calendar.AM)
		{
			ampmS = "오전";
		}else ampmS = "오후";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		//년 월 일 요일 오후 시 분 초 입니다.
		
		System.out.printf("%d년 %d월 %d일 %s요일 %s %d시 %d분 %d초", 
				year, month+1, date, day, ampmS, hour, minute, second);
		
		
		String stringyear = Integer.toString(c.get(Calendar.YEAR));
		String stringmonth = Integer.toString((c.get(Calendar.MONTH))+1);
		String stringdate = Integer.toString(c.get(Calendar.DATE));
		String stringbd = (stringyear+stringmonth+stringdate);
		System.out.println();
		stringbd.concat(stringyear);
		
		System.out.println(stringmonth);
		System.out.println(stringbd);
		
		
		
	}

}