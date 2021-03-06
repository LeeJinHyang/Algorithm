package 신규아이디추천;

import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1. 소문자
        
        new_id = new_id.toLowerCase();
        StringBuilder std = new StringBuilder(new_id);
        //2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표 제외한 모든 문자 제거
        for(int i = 0; i < std.length(); i++){
            char ch = std.charAt(i);
            if(!((ch>='a' && ch <= 'z') || ch == '-' || ch == '_' || ch=='.' || (ch >= '1' && ch <= '9'))  ){
                std.deleteCharAt(i);
                i--;
            }
        }
        //3. .여러개는 .개로 대체
        for(int i = 0; i < std.length()-1; i++){
            char ch = std.charAt(i);
            if(ch=='.'){
                for(int j = i+1; j < std.length(); j++){
                    if(std.charAt(j)!= '.'){
                        break;
                    }
                    else{
                        std.deleteCharAt(j);
                        j--;
                    }
                }
                
            }
        }
        //4. .이 맨 처음이나 마지막 존재하면 삭제
        if(std.charAt(0) == '.'){
            std.deleteCharAt(0);
        }
        if(std.length()-1 >= 0 && std.charAt(std.length()-1) == '.'){
            std.deleteCharAt(std.length()-1);
        }
        //5. 아이디가 빈 문자열이면 a를 대입
        if(std.length() == 0){
            std.append('a');
        }
        //6. 16이상이라면 15자까지만 살리기 만약 제거후 맨 마지막 .이면 삭제
        if(std.length() >= 16){
            System.out.println(std.toString());
            std = new StringBuilder(std.substring(0,15));
                        System.out.println(std.toString());
            if(std.charAt(std.length()-1) == '.'){
                std.deleteCharAt(std.length()-1);
            }
        }
        //7. 2자 이하면 마지막 문자를 3이 되게 끝에 붙인다
        if(std.length() <= 2){
            char last = std.charAt(std.length()-1);
            while(std.length() != 3){
            std.append(last);
            }
        }
        return std.toString();
    }
}