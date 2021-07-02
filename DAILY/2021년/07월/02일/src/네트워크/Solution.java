package 네트워크;

import java.util.*;
class Solution {

    static int[][] map;
    static boolean[] visited;
    static void BFS(int p){
        Queue<Integer> que = new LinkedList<>();
        que.add(p);
        while(!que.isEmpty()){
            int pre = que.poll();
            for(int i = 0; i < map.length; i++){
                if(!visited[i] && pre != i && map[pre][i] == 1){
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        map = new int[computers.length][computers[0].length];
        for(int i = 0; i <computers.length; i++){
            map[i] = computers[i].clone();
        }
        visited = new boolean[n+1];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                BFS(i);
                answer++;
            }
        }
        return answer;
    }
}