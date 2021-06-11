package 가장큰수;

import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<Integer> list = new ArrayList();
        for(int num : numbers){
            list.add(num);
        }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer num1, Integer num2){
                String str1 = Integer.toString(num1);
                String str2 = Integer.toString(num2);
                return (str2+str1).compareTo(str1+str2);
            }
        });
        if(list.get(0) == 0) return "0";
        StringBuilder std = new StringBuilder();
        for(Integer num : list){
            std.append(Integer.toString(num));
        }
        return std.toString();
    }
}