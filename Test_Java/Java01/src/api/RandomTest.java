package api;

public class RandomTest {

	public static void main(String[] args) {
		int num[] = new int[6];
		int i, j;
		int n;
		loop:
		for(i = 0; i<num.length; i++)
		{
			n = (int)(Math.random()*6)+1;
			for(j = 0; j<=i; j++)
			{
				if(n==num[j])
				{
					i--;
					continue loop;
				}
			}//inner for
			num[i] = n;
		}//outer for
		System.out.print("[ ");
		for(i = 0; i<num.length; i++)
		{
			System.out.print(num[i] + (i < num.length-1 ? ",":""));
		}
		System.out.print(" ]");
		
		//정렬
		int a = 0,b = 0;
		
		for(i=0; i<num.length; i++)
		{
			for(j= i+1; j<num.length; j++)
			{
				a++;
				if(num[i] > num[j])
				{	
					b++;
					int z = 0;
					z = num[i];
					num[i] = num[j];
					num[j] = z;
				}//교환
			}
			System.out.print(num[i]);
		}//출력
		System.out.printf("\n비교: %d, 교환: %d", a, b);
	}
}
