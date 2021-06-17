package 약수의개수덧셈;

import java.util.*;
class Solution {
    static public int nums(int num){
        if(Math.sqrt(num) - (int)(Math.sqrt(num)) == 0.0){
            return 1;
        }
        return 0;
    }
    public int solution(int left, int right) {
        int answer = 0;
        //약수의 개수가 짝수인너 더하고
        //홀수인건 뺀다
        for(int i = left; i <= right; i++){
            int num = nums(i);
            if(num == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}