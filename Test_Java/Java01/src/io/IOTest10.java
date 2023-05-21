package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest10 {

	public static void main(String[] args) throws Exception{
		Data d;
		ObjectInputStream in = null;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		
		try {
		while(true) {
				d = (Data) in.readObject();
				System.out.println(d);
			}
		}catch(EOFException e) {}
		
		in.close();
	}
}