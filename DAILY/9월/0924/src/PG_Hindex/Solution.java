package PG_Hindex;

import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //일단 최대 인용수를 구한다
        Arrays.sort(citations);
        int max =citations[citations.length-1];
        System.out.println(max);
        int[] arrUpper = new int[max+1];
        int[] arrLower = new int[max+1];
        //arr의 수들을 채워준다
        for(int i = 0; i < citations.length;i++){
            int num = citations[i];
            for(int j = 0; j <= num; j++){
                arrUpper[j]++;
            }
            for(int j = max; j >= num; j--){
                arrLower[j]++;
            }
        }
        
        //arr를 돌며 가장 큰 index = arr[index]인 수를 구한다
        for(int i = 0; i <= max; i++){
            if(arrUpper[i] >= i  && i >= arrLower[i]) answer = i;
        }
        return answer;
    }
}