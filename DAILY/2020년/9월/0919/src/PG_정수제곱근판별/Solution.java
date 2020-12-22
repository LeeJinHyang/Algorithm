package PG_정수제곱근판별;

import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtNum = Math.sqrt(n);
        System.out.println(sqrtNum);
        if(sqrtNum % 1 == 0){
            answer = (long)Math.pow(sqrtNum+1, 2);
        }
        else answer = -1;
        return answer;
    }
}