package PG_기능개발;

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int index = 0;
        LinkedList<Integer> list  = new LinkedList();
        while(index != progresses.length){
            int count = 0;
            for(int i = index; i < progresses.length; i++){
                progresses[i] += speeds[i];
                if(i == index && progresses[i] >= 100){
                    index++;
                    count++;
                }
                
            }
            if(count>0){
                list.add(count);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}