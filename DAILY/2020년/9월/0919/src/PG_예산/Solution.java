package PG_예산;

import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < d.length; i++){
            if(sum + d[i] <= budget){
                sum += d[i];
                count++;
            }
            else break;
        }
        answer = count;
        return answer;
    }
}