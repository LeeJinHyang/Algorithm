package PG_«¡∏∞≈Õ;

import java.util.*;
class Solution {
    static class Point{
        int index;
        int num;
        Point(int index, int num){
            this.index = index;
            this.num = num;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Point> que = new LinkedList();
        for(int i = 0; i < priorities.length; i++){
            que.add(new Point(i,priorities[i]));
        }
        Arrays.sort(priorities);
        int idx = priorities.length - 1;
        while(!que.isEmpty()){
            if (priorities[idx] == que.peek().num){
                if(location == que.peek().index){
                    return priorities.length - idx;
                }
                que.poll();
                idx --;
            }
            else{
                Point point = que.poll();
                que.add(point);
            }
            
        }
        return answer;
    }
}