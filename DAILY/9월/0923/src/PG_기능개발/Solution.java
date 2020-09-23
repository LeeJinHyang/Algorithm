package PG_기능개발;

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] result = new int[progresses.length];
        Queue<Point> que = new LinkedList<>();
        for(int i = 0; i <progresses.length; i++ ){
            que.add(new Point(i,progresses[i],speeds[i]));
        }
        int i = 0;
        int index = 0;
        int count = 0;
        while(!que.isEmpty()){
            Point next = que.peek();
            
            if(next.speed * i + next.progress>= 100 ){
                que.poll();
                count++;
                result[index] = count;
            }
            else{
                if(result[index] != 0){
                    index++;
                }
                i ++;
                count = 0;
                
                
            }
        }
        result[index] = count;
        answer = new int[index+1];
        for(int j = 0; j <= index; j ++){
            answer[j] = result[j];
        }
        return answer;
    }
    static class Point{
        int index;
        int progress;
        int speed;
        Point(int index, int progress, int speed){
            this.index = index;
            this.progress = progress;
            this.speed = speed;
        }
    }
}