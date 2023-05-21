package BOJPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReader_Writer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++)
		{
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]),b = Integer.parseInt(input[1]);
			bw.write("Case #"+(i+1)+":"+ a+" + "+b + " = "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}