package PG_�ùٸ���ȣ;

import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push('(');
            }
            else {
                if(!stack.isEmpty()){
                   stack.pop(); 
                }
                else return false;
                
            }
            
        }
        if(!stack.isEmpty()) return false;
        else return  true;

    }
}