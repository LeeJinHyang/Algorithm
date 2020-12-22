package 스킬체크_최소공배수;

import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            int gcd = GCD(answer , arr[i]);
            answer = answer / gcd * arr[i]/gcd * gcd;
        }
        
        
        
        return answer;
    }
    static int GCD(int num1, int num2){
        if(num1 % num2 == 0) return num2;
        else return GCD(num2, num1 % num2);
    }
    
}