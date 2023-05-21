package BOJPractice;

public class Solution {
	public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        String a = my_string.substring(s,e+1);
        String b = "";
        for(int i = e; i>=s; i--)
        {
            b += Character.toString(a.charAt(i-s));
        }
        answer += b + my_string.substring(e+1);
        return answer;
    }
}
