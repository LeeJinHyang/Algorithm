package 게임맵최단거리;

import java.util.*;
class Solution {
    static int[] rd = {0,0,1,-1};
    static int[] cd = {1,-1, 0,0};
    static boolean[][] visited;
    static int[][] map;
    static int result;
    static class Point{
        int x;
        int y;
        int depth;
        Point(int x, int y, int depth){
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
    static void bfs(Point point){
        Queue<Point> que = new LinkedList<>();
        que.add(point);
        while(!que.isEmpty()){
            Point pre = que.poll();
            for(int dir = 0; dir < rd.length; dir++){
                int nr = pre.x + rd[dir];
                int nc = pre.y + cd[dir];
                if(nr >= 0 && nr < map.length && nc >= 0 && nc < map[0].length && !visited[nr][nc] && map[nr][nc] == 1){
                    if(nr == map.length-1 && nc == map[0].length-1){
                        result = Math.min(result, pre.depth + 1);
                        return;
                    }
                    visited[nr][nc] = true;
                    que.add(new Point(nr, nc, pre.depth+1));
                }
            }
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        map = maps;
        result = 987654321;
        bfs(new Point(0,0,1));
        if(result == 987654321) result = -1;
        return result;
    }
}