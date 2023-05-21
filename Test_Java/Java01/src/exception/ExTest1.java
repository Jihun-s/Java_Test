package exception;

public class ExTest1 {

	public static void main(String[] args) {
		String ar[]	= {"10", ""};
		int a, b, c;

		try
		{
			a = Integer.parseInt(ar[0]);	
			b = Integer.parseInt(ar[1]);	
			c = a / b;
			System.out.println(c);
		}
		catch(NumberFormatException d)
		{
			System.out.println("숫자가 아님");
			return;
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");	
		}catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("배열의 Index가 범위를 넘어감");
		}
		finally {
			System.out.println("마지막에 무조건");
		}
		
		System.out.println("프로그램의 끝");
	}
}
