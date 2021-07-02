package 이중우선순위큐;

import java.util.*;
class Solution {
    static PriorityQueue<Integer> maxQueue;
    static PriorityQueue<Integer> minQueue;
    static void delete(PriorityQueue<Integer> que, int num){
        List<Integer> tmp = new ArrayList<>();
        while(!que.isEmpty()){
            int cnt = que.poll();
            if(cnt == num) break;

            tmp.add(cnt);

        }
        que.addAll(tmp);
    }
    public int[] solution(String[] operations) {
        int[] answer = {};
        //최대큐, 최소큐를 만들어서 둘이 겹치는 것만 취하면 안될까
        maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        minQueue = new PriorityQueue<>();
        for(String oper :operations){
            String[] str = oper.split(" ");
            if(str[0].equals("I")){
                maxQueue.add(Integer.parseInt(str[1]));
                minQueue.add(Integer.parseInt(str[1]));
                // System.out.println(maxQueue.size());
            }else if(!maxQueue.isEmpty()){
                if(str[1].equals("1")){
                    //maxQueue
                    // System.out.println(maxQueue.size());
                    delete(minQueue, maxQueue.poll());
                    // System.out.println(maxQueue.size());
                }else{
                    //minQueue
                    // System.out.println(maxQueue.size());
                    delete(maxQueue, minQueue.poll());
                    // System.out.println(maxQueue.size());

                }
            }
        }

        answer = new int[2];

        if(!maxQueue.isEmpty()){
            answer[0] = maxQueue.poll();
            answer[1] = minQueue.poll();

        }
        return answer;
    }

}