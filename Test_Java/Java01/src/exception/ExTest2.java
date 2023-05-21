package exception;

import java.io.IOException;

public class ExTest2 {

	public static void main(String[] args) throws IOException{
		
		input();
	}
	
	static void input() throws IOException{
		int ch = 0;
		
		ch = System.in.read();
//		try {
//			ch = System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println((char) ch);
	}

}
