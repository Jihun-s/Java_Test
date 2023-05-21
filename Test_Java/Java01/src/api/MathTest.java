package api;

public class MathTest {

	public static void main(String[] args) {
//		Math m - new Math();
		
		int i = Math.abs(-3);
		System.out.println(i);
		
		System.out.println(Math.round(1.7));	//반올림
		System.out.println(Math.ceil(-1.7));	//가장 가까운 큰 정수
		System.out.println(Math.floor(1.7));	//
		
		System.out.println(Math.pow(2, 10));	//(a, b) a를 b번 곱함
		System.out.println(Math.sqrt(2));		//루트2
		
		//System.out.println(Math.random());		//0이상 1미만의 임의의 수
		
		for (int a = 0; a<10; a++)
		{
			int b = 6;
			System.out.print((int)(Math.random()*b)+1);	//0 ~ (b-1) 안에서의 랜덤정수
			if(!(a==9))System.out.print(", ");
		}
		System.out.println();
	}
}
