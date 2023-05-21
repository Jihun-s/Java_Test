package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest8 {

	public static void main(String[] args) throws Exception{
		ArrayList<String> ar;
		ObjectInputStream in = null;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		
		ar = (ArrayList<String>) in.readObject();
		System.out.println(ar);
		in.close();
	}
}
