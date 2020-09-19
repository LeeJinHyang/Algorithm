package PG_정수내림차순으로배치하기;

import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        int N = Long.toString(n).length();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++ ){
            
            arr[i] = (int)(n % 10);
            n = n / 10;
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            answer *= 10;
            answer += arr[i];
            
        }
        return answer;
    }
}