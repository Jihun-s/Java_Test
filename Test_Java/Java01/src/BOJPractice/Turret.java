package BOJPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Turret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		int t = sc.nextInt();
		int i = 0;
		boolean roop = true;
		while(roop)
		{
			int answer = 1;
			int x1,y1,r1,x2,y2,r2;
			x1 = sc.nextInt();y1 = sc.nextInt();r1 = sc.nextInt();
			x2 = sc.nextInt();y2 = sc.nextInt();r2 = sc.nextInt();
			double a = Math.pow(x2-x1, 2);
			double b = Math.pow(y2-y1, 2);
//			double distance = Math.sqrt(a+b);
			double distance = a+b;
			double sumRadius = Math.pow(r1+r2, 2);
			double summRadius = Math.pow(r1-r2, 2);
			if(distance ==0&& r1==r2)
			{
				answer = -1;
			}
			else if(distance> sumRadius||distance<summRadius)
			{
				answer = 0;//Case1 
			}
			else if(distance == sumRadius||distance == summRadius)
			{
				answer = 1;//Case2
			}
			else 
				answer = 2;
			
			num.add(answer);
			i++;
			if(i==t)
			{
				for(int j=0; j<t; j++)
				{
					System.out.println(num.get(j));
				}
				return;
			}
		}
	}

}
