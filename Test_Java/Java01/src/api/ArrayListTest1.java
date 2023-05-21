package api;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String을 저장할 ArrayList 생성
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("지훈");
		list.add("짱짱짱");
		list.add("ccc");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println("==========구분=============");
		
		list.add(1, "bbb");	//해당 자리에 추가하고 뒷자리들 뒤로 밂
		list.set(0, "aaa");	//원래 변수를 지우고 입력
		System.out.println(list);
		
		System.out.println(list.get(0));	//해당 자리 변수 불러오기.
		System.out.println(list.remove(0));	//불러오고 본체 삭제.
		System.out.println(list);
		System.out.println(list.contains("ccc"));	//존재 여부
		System.out.println(list.indexOf("ccc"));	//변수 위치
		System.out.println(list);
		System.out.println("======구분======");
		for(int i =0; i<list.size(); i++)
		{
			System.out.printf("%d번 단어: %s\n",i+1,list.get(i));
		}
		for(String s : list) System.out.printf("단어: %s\n", s);
	}
}
