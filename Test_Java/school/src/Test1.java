import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, count = 0;
		for(int i = 0; i<10; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("배열 : ");
		for(int i:num)
		{
			if(max<i)
			{
				max = i;
			}
			if(min>i)
			{
				min = i;
			}
			count++;
			System.out.print(i);
			if(count !=10)
			{
				System.out.print(", ");
			}
		}
		System.out.printf("\n최대값 :%d\n최솟값 :%d", max, min);
	}
}
