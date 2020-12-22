package PG_멀쩡한사각형;

import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long max = Math.max(w,h);
        long min = Math.min(w,h);
        
        long gcd = GCD(max,min);
        answer = (long)w * (long)h - ((long)w + (long)h - gcd);
        
        return answer;
    }
    static long GCD(long num1, long num2){
        if(num2 == 0) return num1;
        else return GCD(num2, num1%num2);
}
}
