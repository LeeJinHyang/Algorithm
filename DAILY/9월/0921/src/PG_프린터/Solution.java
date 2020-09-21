package PG_«¡∏∞≈Õ;

import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int pri : priorities){
            que.add(pri);
        }
        while(!que.isEmpty()){
        for(int i = 0; i < priorities.length; i++){
            if(que.peek()==priorities[i]){
                que.poll();
                answer++;
                if(location == i){
                    que.clear();
                    break;
                }
            }
        }
        }
        return answer;
    }

}