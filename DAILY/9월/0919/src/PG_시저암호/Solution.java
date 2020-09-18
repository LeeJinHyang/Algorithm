package PG_시저암호;

import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder std = new StringBuilder(s);
        for(int i = 0; i< std.length(); i++){
            char temp = std.charAt(i);
            if(temp >= 'a' && temp <= 'z'){
                if((char)((int)temp + n) > 'z'){
                    temp = (char)((int)temp + n - 26);
                }
                else temp = (char)((int)temp + n);
                
            }
            else if(temp >= 'A' && temp <= 'Z'){
                if((char)((int)temp + n) > 'Z'){
                    temp = (char)((int)temp + n - 26);
                }
                else temp = (char)((int)temp + n);
                
            }
            
            std.setCharAt(i, temp);
        }
        answer = std.toString();
        return answer;
    }
}