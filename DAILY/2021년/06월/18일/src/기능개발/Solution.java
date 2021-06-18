package 기능개발;

import java.util.*;
class Solution {
    static class Progress{
        int progress;
        int speed;
        Progress(int progress, int speed){
            this.progress = progress;
            this.speed = speed;
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Progress> que = new LinkedList<>();
        for(int i = 0; i < speeds.length; i++){
            que.add(new Progress(progresses[i], speeds[i]));
        }
        int day = 1;
        int dayCnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(!que.isEmpty()){
            int cnt = 0;
            while(!que.isEmpty() && que.peek().progress + que.peek().speed * day >= 100){
                que.poll();
                cnt++;
            }
            if(cnt != 0) {
                list.add(cnt);
                dayCnt++;
            }


            day++;
        }
        answer = new int[dayCnt];
        for(int i = 0; i < dayCnt; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}