package PG_다리를지나는트럭;

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Point> que = new LinkedList<>();
        Queue<Point> presentQue = new LinkedList<>();
        
        for(int i = 0; i < truck_weights.length; i++){
            System.out.println(i);
            que.add(new Point(truck_weights[i],0));
        }
        int totalTime = 0;
        int presentWeight = 0;
        System.out.println(que.isEmpty());
        while(!que.isEmpty()||!presentQue.isEmpty()){
            answer++;
            
            if(!presentQue.isEmpty()){
                Point present = presentQue.peek();
                if((answer - present.time) == bridge_length){
                    presentQue.poll();
                    presentWeight -= present.weight;
                }
            }
            
            
            if(!que.isEmpty()){
                Point next = que.peek();
                if(next.weight + presentWeight <= weight){
                    que.poll();
                    next.time = answer;
                    presentQue.add(next);
                    presentWeight = next.weight + presentWeight;
                }    
            }
            
        }
        
        return answer;
    }
    static class Point{
        int weight;
        int time;
        Point(int weight, int time){
            this.weight = weight;
            this.time = time;
        }
    }
}