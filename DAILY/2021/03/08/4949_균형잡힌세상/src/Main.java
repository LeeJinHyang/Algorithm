package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            Stack<Character> stack = new Stack<>();
            String str = sc.nextLine();
            if(str.equals(".")){
                return;
            }
            boolean flag = true;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i)=='(' || str.charAt(i) == '['){
                    stack.push(str.charAt(i));
                }
                else if(str.charAt(i)==')'){
                    if(!stack.empty() && stack.peek()=='('){
                        stack.pop();
                    } 
                    else {
                        flag = false;
                        break;
                    }
                }
                else if(str.charAt(i)==']'){
                    if(!stack.empty() && stack.peek()=='['){
                        stack.pop();
                    } 
                    else {
                        flag = false;
                        break;
                    }
                }
                
            }
            if(flag&&stack.empty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
    
}
