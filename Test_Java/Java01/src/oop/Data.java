package oop;

public class Data {
	int x, y;
	
	public Data() {}
	
	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print()
	{
		System.out.printf("x: %d, y: %d\n",x,y);
	}
	
	public int sum()
	{
		return x+y;
	}
	public static int sum(int x, int y)
	{
		return x+y;
	}
	public static int sum(int x, int y, int z)
	{
		int answer = 0;
		
		for(int i = x; i<=y; i+=z)
		{
			answer += i;
		}
		
		return answer;
	}
	public static int power(int x, int y)
	{
		int answer = 1;
		for(int i=0; i<y; i++)
		{
			answer *= x;
		}
		return answer;
	}
	
	@Override
	public String toString() {
		return "Data [x=" + x + ", y=" + y + "]";
	}
}
