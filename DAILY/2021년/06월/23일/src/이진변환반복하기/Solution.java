package 이진변환반복하기;

import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int doCnt = 0;
        int deleteCnt = 0;
        while(!s.equals("1")){
            StringBuilder std = new StringBuilder();
            //1. 0 제거
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) =='1'){
                    std.append(1);
                }
                else {
                    deleteCnt++;
                }
            }
            //2. 문자열의 길이 2진법으로
            s = Integer.toBinaryString(std.length());
            doCnt++;

        }
        answer = new int[2];
        answer[0] = doCnt;
        answer[1] = deleteCnt;
        // {doCnt, deleteCnt};
        return answer;
    }
}