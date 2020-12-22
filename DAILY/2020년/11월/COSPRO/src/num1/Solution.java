package num1;

//You may use import as below.
//import java.util.*;

class Solution {
 public long solution(long num) {
     // Write code here.
     long answer = 0;
     num += 1;
     StringBuilder str = new StringBuilder();
     str.append(Long.toString(num));
     for(int i = 0; i < str.length(); i++){
         if(str.charAt(i) == '0'){
             str.setCharAt(i,'1');
         }
     }
     answer = Long.parseLong(str.toString());
     return answer;
 }

 // The following is main method to output testcase.
 public static void main(String[] args) {
     Solution sol = new Solution();
     long num = 9949999;
     long ret = sol.solution(num);

     // Press Run button to receive output. 
     System.out.println("Solution: return value of the method is " + ret + " .");
 }
}