package PG_하샤드수;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        //x 가 하샤드 수라면 x의 자릿수의 합으로 x가 나누어져야한다
        int sum = 0;
        int temp = x;
        while(temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        
        if(x % sum == 0){
            answer = true;
        }
        else answer = false;
        
        return answer;
    }
}