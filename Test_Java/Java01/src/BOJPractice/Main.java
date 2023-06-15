package BOJPractice;

public class Main {

	public static void main(String[] args){
		String[] a = {"aya", "yee", "u", "maa", "wyeoo"};
		Solution123 s = new Solution123();
		int n = s.solution(a);
		System.out.println(n);
	}
	
}
class Solution123 {
		    public int solution(String[] babbling) {
		        int answer = 0;
		        for(String s:babbling)
		        {
		            if(s.contains("aya"))
		            {
		                s = s.replace("aya", "");
		            }if(s.contains("ye"))
		            {
		                s = s.replace("ye", "");
		            }if(s.contains("woo"))
		            {
		                s = s.replace("woo", "");
		            }if(s.contains("ma"))
		            {
		                s = s.replace("ma", "");
		            }if(s.equals("")){
		                answer++;
		            }
		        }
		        return answer;
		    }
		}
