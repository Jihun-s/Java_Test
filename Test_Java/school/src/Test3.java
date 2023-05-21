import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine(); int j = str.length()-1;
		boolean answer = false;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				j--;
				answer = true;
				continue;
			}else if(j>=i)
			{
				break;
			}
			answer = false;
		}
		System.out.println("출력 : " + answer);
		
	}
}
