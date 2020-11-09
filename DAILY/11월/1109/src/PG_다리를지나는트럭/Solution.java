package PG_�ٸ���������Ʈ��;

import java.util.*;

class Solution {
    static class Point{
        int time;
        int weight;
        Point(int time, int weight){
            this.time = time;
            this.weight = weight;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> waitQue = new LinkedList();
        Queue<Point> runQue = new LinkedList();
        //waitQue�� ä���ش�
        for(int i = 0; i < truck_weights.length; i++){
            waitQue.add(truck_weights[i]);
        }
        
        int bridgeWeight = 0;
        int time = 0;
        while(!waitQue.isEmpty() || !runQue.isEmpty()){
            //1. �޸��� Ʈ�� Ȯ��
            if(!runQue.isEmpty()){
            Point point = runQue.peek();
            if(time - point.time>= bridge_length){
                    runQue.poll();
                    bridgeWeight -= point.weight;
                }
            }
            
            //2. ����ϴ� Ʈ�� Ȯ��
            if(!waitQue.isEmpty()){
            int next = waitQue.peek();
            if(bridgeWeight+ next <= weight){
               bridgeWeight += next;
               runQue.add(new Point(time, next));
               waitQue.poll();
               }
            }
            time ++;
            
            
        }
        return time;
    }
}