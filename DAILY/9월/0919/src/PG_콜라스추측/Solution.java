package PG_콜라스추측;

class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long n = (long)num;
        while(true){
            if(n == 1) break;
            if(count >= 500) {
                count = -1;
                break;
            }
            if(n % 2 == 0) n = n / 2;
            else n = n * 3 + 1; 
            count++;
        }  
        
        answer = count;
        return answer;
    }
    
}