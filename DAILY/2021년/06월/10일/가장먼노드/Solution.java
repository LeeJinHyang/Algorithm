import java.util.*;
class Solution {
    static boolean[] visited;
    static boolean[][] edges;
    static int maxCnt;
    static int count;
    static class Point{
        int idx; 
        int cnt;
        Point(int idx, int cnt){
            this.idx = idx;
            this.cnt = cnt;
        }
    }
    static void bfs(int idx, int cnt){
        Queue<Point> point = new LinkedList();
        point.add(new Point(idx, cnt));
        while(!point.isEmpty()){
            Point pre = point.poll();
            if(pre.cnt > maxCnt){
                maxCnt = pre.cnt;
                count = 0;
            }
            if(pre.cnt == maxCnt){
                count++;
            }
            for(int i = 0; i < edges.length; i++){
                if(edges[pre.idx][i] && !visited[i]){
                    visited[i] = true;
                    point.add(new Point(i, pre.cnt+1));
                }
            }
        }
    }
    //bfs로 돌면서 각각 횟수가 최대일 때 개수를 구한다
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        edges = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        maxCnt = 0;
        count = 0;
        for(int[] ed : edge){
            edges[ed[0]][ed[1]] = true;
            edges[ed[1]][ed[0]] = true; 
        }
        visited[1] = true;
        bfs(1, 0);
        
        return count;
    }
}