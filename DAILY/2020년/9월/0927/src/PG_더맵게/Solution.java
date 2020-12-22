package PG_더맵게;

import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> list = new PriorityQueue();
        for(int i = 0; i < scoville.length; i++){
            list.add(scoville[i]);
        }
        while(list.peek() < K){
            if(list.size() == 1){
                return -1;
            }
            answer++;
            int min1 = list.poll();
            int min2 = list.poll();
            list.offer(min1 + min2 * 2);
            
            
        }
        return answer;
    }
}