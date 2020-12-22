package num2;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		String[] S = {"abc","bca","dbe"};
		solution(S);
	}
	
	static int[] solution(String[] S) {
		int[] answer = {};
		for(int i  = 0; i < S.length-1; i++) {
			String str1 = S[i];
			for(int j = i+1; j< S.length; j++) {
				String str2 = S[j];
				for(int ch = 0; ch <str1.length(); ch++ ) {
					if(str1.charAt(ch) == str2.charAt(ch)) {
						answer = new int[3];
						answer[0] = i;
						answer[1] = j;
						answer[2] = ch;
						
						return answer;
					}
						
				}
			}
		}
		return answer;
		
	}
}
