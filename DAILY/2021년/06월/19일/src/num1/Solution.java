package num1;

import java.util.*;
public class Solution {
   static public String solution(String S, String C) {
        // write your code in Java SE 8
        //C는 회사이름
        //S는 문자열들
        StringBuilder std = new StringBuilder();
        String[] names = S.split(";");
        String company = "@"+C.toLowerCase()+".com";
        Map<String, Integer> emailMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            if(i != 0) std.append("; ");
            name = name.trim();
            //
            String[] detailNames = name.split(" ");
            StringBuilder email = new StringBuilder();
            detailNames[0] = detailNames[0].replaceAll("-","");
            email.append(detailNames[0].toLowerCase());
            email.append(".");
            detailNames[detailNames.length-1] = detailNames[detailNames.length-1].replaceAll("-","");
            if(detailNames[detailNames.length-1].length() > 8){
                email.append(detailNames[detailNames.length - 1].toLowerCase().substring(0,8));

            }else {
                email.append(detailNames[detailNames.length - 1].toLowerCase());
            }
            //같은 이메일 있을 때
            if(emailMap.containsKey(email.toString())){//같은 이름이 있을 때
                int num = emailMap.get(email.toString());
                emailMap.put(email.toString(), num+1);
                email.append(Integer.toString(num+1));

            }else{
                emailMap.put(email.toString(), 1);
            }
            email.append(company);
            std.append(name+" <");
            std.append(email.toString());
            std.append(">");

        }
        return std.toString();
    }

    public static void main(String[] args) {
        String name = "John Doe-asdfghjkl; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String c = "Example";
        String result = solution(name, c);
        System.out.println(result);
    }

}
