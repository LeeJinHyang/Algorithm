package PG_이상한문자만들기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        StringBuilder std = new StringBuilder(s);
        int num = 0;
        for(int i = 0; i < std.length(); i++){
            char temp = std.charAt(i);
            if(temp == ' ' ){
                num = 0;
                continue;
            }
            if(num % 2 == 0){
                std.setCharAt(i, Character.toUpperCase(temp));
                num ++;
            }
            else{
                std.setCharAt(i, Character.toLowerCase(temp));
                num ++;
            }
            
        }
        answer = std.toString();
        return answer;
    }
}