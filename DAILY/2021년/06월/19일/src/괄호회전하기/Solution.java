package 괄호회전하기;

import java.util.*;
class Solution {
    static boolean isCorrect(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() &&(ch == ')' ||ch == '}' ||ch == ']' )){
                char pre = stack.pop();
                if(ch == ')' ){
                    if(pre != '(') return false;
                }else if(ch == ']' ){
                    if(pre != '[') return false;
                }else if(ch == '}' ){
                    if(pre != '{') return false;
                }
            }else{
                stack.push(ch);
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
    public int solution(String s) {
        int answer = 0;
        StringBuilder std = new StringBuilder(s);
        for(int i = 0; i < std.length(); i++){

            boolean flag = isCorrect(std.substring(i, std.length()) + std.substring(0,i));
            if(flag) answer++;
        }
        return answer;
    }
}