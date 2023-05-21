package api;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<Data>();
		
		Data d = null;
		
		d = new Data();
		d.setNum(1);
		d.setName("모니터");
		list.add(d);
		
		d = new Data();
		d.setNum(2);
		d.setName("키보드");
		list.add(d);
		
		d = new Data();
		d.setNum(3);
		d.setName("마우스");
		list.add(d);
		
		d = new Data();
		d.setNum(4);
		d.setName("스피커");
		list.add(d);
		System.out.println(list);
		
		Scanner scan = new Scanner(System.in);
		Data input = new Data();
		input.setNum(scan.nextInt());
		input.setName(scan.next());
		
		//입력한 값이 리스트에 있는지 위치 출력
		int i = list.indexOf(input);
		if(i == -1)
		{
			System.out.println("해당사항 없음");
		}else 
		{
			System.out.println(i + "번째");
		}
	}

}
