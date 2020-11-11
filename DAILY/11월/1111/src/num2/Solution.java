package num2;

//You may use import as below.
//import java.util.*;

class Solution {
 public int solution(int n) {
     // Write code here.
     int answer = 0;
     int[][] map = makeMap(n);
     for(int i = 0; i < n; i++) {
    	 answer += map[i][i];
     }
     return answer;
 }
 public int[][] makeMap(int n){
	 int[][] map = new int[n][n];
	 int maxX = n-1;
	 int minX = 0;
	 int maxY = n-1;
	 int minY = 0;
	 
	 int num = 1;
	
	 while(num <= n*n) {
	 //1. À­ÁÙ
	 for(int i = minX; i <= maxX; i++) {
		 map[minY][i] = num;
		 num++;
	 }
	 
	 //2.¿À¸¥ÂÊ ¿·ÁÙ
	 for(int j = minY+1; j<= maxY; j++ ) {
		 map[j][maxX] = num;
		 num++;
	 }
	 
	 //3.¾Æ·§ÁÙ
	 for(int i = maxX-1; i >= minX; i--) {
		 map[maxY][i] = num++;
		 
	 }
	 //4.¿ÞÂÊ¿·ÁÙ
	 for(int j = maxY-1; j >= minY+1; j--) {
		 map[j][minX] = num++;
	 }
	 minX++;
	 minY++;
	 maxX--;
	 maxY--;
	 for(int i = 0; i < n; i++) {
		 for(int j = 0; j < n; j++) {
			 System.out.print(map[i][j]+" ");
		 }
		 System.out.println();
	 }
	 }
	 return map;
 }

 // The following is main method to output testcase.
 public static void main(String[] args) {
     Solution sol = new Solution();
     int n1 = 3;
     int ret1 = sol.solution(n1);

     
     // Press Run button to receive output. 
     System.out.println("Solution: return value of the method is " + ret1 + " .");
     
     int n2 = 2;
     int ret2 = sol.solution(n2);
     
     // Press Run button to receive output. 
     System.out.println("Solution: return value of the method is " + ret2 + " .");
 }
}