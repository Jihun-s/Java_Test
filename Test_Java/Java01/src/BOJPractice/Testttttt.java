package BOJPractice;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Testttttt {

	public static void main(String[] args) throws IOException {
		String s = "가나다라";
		String s2 = URLEncoder.encode(s,"UTF-8");
        String s3 = URLDecoder.decode(s2,"UTF-8");
        System.out.println(s2);
        System.out.println(s3);
	}
}
