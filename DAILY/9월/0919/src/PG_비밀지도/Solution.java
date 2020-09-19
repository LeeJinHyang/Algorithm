package PG_비밀지도;

import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n] ;
        for(int i = 0; i < n; i++){
            String std1 = setString(Integer.toBinaryString(arr1[i]),n);
            
            String std2 = setString(Integer.toBinaryString(arr2[i]),n);
            
            
            StringBuilder std = new StringBuilder();
            for(int j = 0; j < std1.length(); j++){
                if(std1.charAt(j) == '1'){
                    std.append('#');
                }
                else std.append(" ");
            }
            for(int j = 0; j < std2.length(); j++){
                if(std2.charAt(j) == '1'){
                    std.setCharAt(j,'#');
                }
            }
            
            answer[i] = std.toString();
        }
        
        return answer;
    }
    static String setString(String str, int n){
        StringBuilder std = new StringBuilder();
        for(int i = 0; i < n - str.length(); i++){
            std.append('0');
        }
        for(int i = 0; i < str.length(); i++){
            std.append(str.charAt(i));
        }
        return std.toString();
    }
}