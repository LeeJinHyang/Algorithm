package PG_문자열내p와y의개수;

import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pnum = 0;
        int ynum = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i)=='y') ynum++;
            if(s.charAt(i) == 'p') pnum++;
        }
        if(pnum == ynum) answer = true;
        else answer = false;
        return answer;
    }
}