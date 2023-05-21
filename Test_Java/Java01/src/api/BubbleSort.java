package api;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = { 5,2,8,3,1 };
//		int num[] = { 1,2,3,4,5 };
		int i, j, tmp = 0;
		boolean flag;
		//정렬 전 출력
		for(i = 0; i<num.length; i++)
		{
			System.out.printf("%d ", num[i]);
		}System.out.println();
		
		//정렬
		int a=0,b=0;
		for(i = 0; i<num.length-1; i++)	//Or for(i=num.length -1; i>0; i--)
		{
			flag = true;
			for(j = 0; j<num.length-1-i; j++)	//Or for(j=0; j<i; j++)
			{
				a++;
				if(num[j]>num[j+1])
				{
					b++;
					flag = false;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
			if(flag) break;
		}
		for(i = 0; i< num.length; i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.printf("\na값: %d, b값: %d",a,b);
		//정렬 후 출력
	}
}
