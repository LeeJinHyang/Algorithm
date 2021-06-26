package 가장먼노드;

import java.util.*;
class Solution {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges;
    static boolean[] queVisited;
    static int cnt;
    static class Point{
        int idx;
        int depth;
        Point(int idx, int depth){
            this.idx = idx;
            this.depth = depth;
        }
    }
    static void findPath(int start){
        Queue<Point> que = new LinkedList();
        int maxIdx = 0;
        que.add(new Point(start, 0));
        queVisited[start] = true;
        while(!que.isEmpty()){
            Point point = que.poll();
            if(maxIdx < point.depth){
                cnt = 0;
                maxIdx = point.depth;
            }
            if(point.depth == maxIdx) {
                cnt++;
            }
            for(int i = 0; i < edges.get(point.idx).size(); i++){
                int next = edges.get(point.idx).get(i);
                if(!queVisited[next]){
                    queVisited[next] = true;
                    que.add(new Point(next, point.depth + 1));
                }
            }
        }
    }
    public int solution(int n, int[][] edge) {
        edges = new ArrayList<>();
        for(int i = 0; i< n+1; i++){
            edges.add(new ArrayList<>());
        }
        //bfs로 경로 갱신
        for(int[] e : edge){
            edges.get(e[0]).add(e[1]);
            edges.get(e[1]).add(e[0]);
        }
        cnt = 0;
        queVisited = new boolean[n+1];
        findPath(1);
        return cnt;
    }
}