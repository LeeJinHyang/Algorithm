package 다음큰숫자;

import java.util.*;
class Solution {
    public int returnTwoNum(int num){
        String str = Integer.toBinaryString(num);
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }
        return cnt;
    }
    public int solution(int n) {
        int answer = 0;
        int pivotNum = returnTwoNum(n);
        for(int i = n+1; i <= 1000000; i++){
            if(pivotNum == returnTwoNum(i)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}