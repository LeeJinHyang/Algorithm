package PG_124나라의숫자;

class Solution {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"4","1","2"};
        while(n > 0){
             answer = arr[n % 3] + answer;
          n = (n - 1) / 3;
            
        }
        
        return answer;
    }
}