package api;

import java.util.Calendar;
import java.util.Scanner;

import ch05.MyDate;

public class StringTest3_ID {

//주민등록번호 입력받아 검증하고 결과 출력
	//"990101-1234567" 형태로 입력
	//[결과]
	//-입력 오류(글자 수, -위치, 성별)
	//99년 01월 01생 남자입니다.
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String sex = "";
		String id = "";
		int cyear = c.get(Calendar.YEAR);
		int cmonth = c.get(Calendar.MONTH)+1;
		int cdate = c.get(Calendar.DATE);
		int day = 0;
		int month = 0;
		int year = 0;
		
		boolean idTruth = true;
		
		while(idTruth) 
		{
			System.out.println("주민등록번호 입력 : ");
			id = sc.nextLine();

			if(!(id.matches("\\d{6}\\-\\d{7}")))
			{
				System.out.println("잘못된 형식입니다.");
				continue;
			}//숫자만 가능
			day = Integer.parseInt(id.substring(4,6));		//Integer	
			month = Integer.parseInt(id.substring(2,4));		//Integer
			year = Integer.parseInt(id.substring(0,2));		//Integer
			MyDate bday = new MyDate(day, month, year);
			
			//if (id.indesof('-') != 6)
			//if (!id.substring(6,7).equals("-"))
			if(id.length()!=14)
			{
				System.out.println("글자수를 확인하세요");
				continue;
			}//글자 수 오류
			else if(id.charAt(6)!='-') 
			{
				System.out.println("'-'으로 구분되어야 합니다.");
				continue;
			}// "-" 위치 오류
			
			else if(id.charAt(0)<'3' && !( id.charAt(7)=='3' || id.charAt(7)=='4' )) 
			{
				System.out.println("성별을 확인하세요.");
				continue;
			}// 2000년생 뒷자리 첫글자 3or4 아니면 오류
			
			else if(id.charAt(0)>='3' && (id.charAt(7)>'2' || id.charAt(7)<'1')) 
			{
				System.out.println("성별을 확인하세요.");
				continue;
			}//2000년생 이외 뒷자리 첫글자 1or2 아니면 오류
	
			else if(bday.isValid()==false)
			{
				continue;
			}//생년월일 가능 여부
			//나이!
			else{idTruth = false;break;}
		}//ID값이 불가능한 동안
		
		int age = 0;
		if(id.charAt(7)=='1' || id.charAt(7)=='2')
		{
			age = cyear - year - 1900 ;
			if(month * 100 + day > cmonth * 100 + cdate) {age--;}
		}
		if(id.charAt(7)=='3' || id.charAt(7)=='4')
		{
			age = cyear - year-2000;
			if(month * 100 + day > cmonth * 100 + cdate) {age--;}
		}
		
		sex = id.charAt(7)=='1' ||id.charAt(7)=='3'? "남자":"여자";
		System.out.printf("%d년 %d월 %d일생 만%d세 %s입니다.",year, month, day, age, sex);
	
	}//main
}
