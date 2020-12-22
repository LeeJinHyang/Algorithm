package num3;

//You may use import as below.
//import java.util.*;

class Solution {
	static int[] rd = {-2,-1,1,2,2,1,-1,-2};
	static int[] cd = {1,2,2,1,-1,-2,-2,-1};
 public int solution(String pos) {
     // Write code here.
     int answer = 0;
     int r = pos.charAt(0)-'A';
     int c = pos.charAt(1)-'1';
     
     for(int dir = 0;dir < rd.length; dir++) {
    	 int nr = r + rd[dir];
    	 int nc = c + cd[dir];
    	 if(nr >= 0 && nr < 8 && nc >= 0 && nc < 8) {
    		 answer ++;
    	 }
     }
     return answer;
 }

 // The following is main method to output testcase.
 public static void main(String[] args) {
     Solution sol = new Solution();
     String pos = "A7";
     
     
     int ret = sol.solution(pos);

     // Press Run button to receive output. 
     System.out.println("Solution: return value of the method is " + ret + " .");
 }
}