package PG_문자열내림차순으로배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        StringBuilder std = new StringBuilder();
        for(int i = str.length-1; i >= 0; i--){
            std.append(str[i]);
        }
        answer = std.toString();
        return answer;
    }
}