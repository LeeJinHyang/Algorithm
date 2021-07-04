package num2;

import java.util.*;
class Solution {
   static public String[] solution(String s) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        StringBuilder std = new StringBuilder();
        std.append(s);
       boolean flag = false;
        while(std.length() > 0){
            int startIdx = 0;
            int tailIdx = std.length();
            int length = std.length();
            flag = true;
            for(int i = 1; i < std.length()/2+1; i++){
                if(std.substring(startIdx, startIdx + i).equals(std.substring(tailIdx - i, tailIdx)) ){
                    length = i;
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(std.toString());
                std.delete(0, std.length());
            }else{
                list.add(std.substring(startIdx, startIdx + length));
                std.delete(tailIdx - length, tailIdx);
                std.delete(startIdx, startIdx + length);
            }

        }
        if(list.size() == 1){
            answer = new String[1];
            answer[0] = list.get(0);
        }
         else if(flag){//홀수개
             answer = new String[list.size()* 2 - 1];
             int idx = 0;
             for(int i = 0; i < list.size() / 2+1; i++){
                 idx = i;
                 answer[i] = list.get(i);
             }
             idx+= 1;
            answer[idx] = list.get(idx);
            idx++;
             for(int i = list.size() / 2 ; i>= 0; i--){
                 answer[idx] = list.get(i);
                 idx++;
             }
         }else{//짝수일때

            answer = new String[list.size()* 2];
            int idx = 0;
            for(int i = 0; i < list.size(); i++){
                idx = i;
                answer[i] = list.get(i);
            }
            idx++;
            for(int i = list.size() -1 ; i>= 0; i--){
                answer[idx] = list.get(i);
                idx++;
            }
         }
        return answer;
    }

    public static void main(String[] args) {
    String str =   "abcxyasdfasdfxyabc";
    String str2 = "abcxyqwertyxyabc";
    String str3 = "abcdef";
    solution(str3);

;
    }
}