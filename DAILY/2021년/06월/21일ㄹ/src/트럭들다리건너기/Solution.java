package 트럭들다리건너기;

import java.util.*;
class Solution {
    static class Truck{
        int weight;
        int time;
        Truck(int weight, int time){
            this.weight = weight;
            this.time = time;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        //다리가 견딜 수 있는 무게
        //for 돌면서 다리 길이만큼 시간 있다가 나가야 한다
        int time = 0;
        int presentWeight = 0;
        Queue<Integer> waitQueue = new LinkedList<>();
        Queue<Truck> bridgingQueue = new LinkedList<>();
        for(int truck : truck_weights){
            waitQueue.add(truck);
        }
        //que의 맨 처음에 있는게 안빠지면 의미 X
        while(!(waitQueue.isEmpty() && bridgingQueue.isEmpty())){
            //잘못 생각
            //bridge_length >= bridgingQueue.size()
            //일단 빼고
            time ++;
            while(!bridgingQueue.isEmpty()){
                Truck front = bridgingQueue.peek();

                if(time - front.time >= bridge_length){
                    bridgingQueue.poll();
                    presentWeight -= front.weight;

                }else break;
            }
            while(!waitQueue.isEmpty()){
                int front = waitQueue.peek();
                if(bridgingQueue.size()+1 <= bridge_length && presentWeight + front <= weight){
                    waitQueue.poll();
                    Truck truck = new Truck(front, time);
                    presentWeight += front;
                    bridgingQueue.add(truck);
                    break;
                }else break;
            }
        }
        return time;
    }
}