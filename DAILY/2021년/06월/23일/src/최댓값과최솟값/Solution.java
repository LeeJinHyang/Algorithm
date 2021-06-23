package 최댓값과최솟값;

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        String[] stringArray = s.split(" ");
        for(String str:stringArray){
            list.add(Integer.parseInt(str));

        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        answer = Integer.toString(min)+" "+ Integer.toString(max);
        return answer;
    }
}