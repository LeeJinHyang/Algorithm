package 진법3뒤집기;


import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder std = new StringBuilder();
        while(n != 0){
            std.insert(0,Integer.toString(n % 3)); //미리 뒤집어서 넣어준다
            n = n/3;
        }
        System.out.println(std.toString());
        for(int i = 0; i < std.length(); i++){
            System.out.println(i);
            answer += (std.charAt(i)-'0') * Math.pow(3, i);
            System.out.println(std.charAt(i) * Math.pow(3, i));
        }
        return answer;
    }
}