package 게임맵최단거;
import java.util.*;
class Solution {
    static int[][] dirs = {{0, 1},{0, -1}, {1, 0}, {-1, 0}};
    static boolean[][] visited;
    static int[][] map;
    static int[] target;
    static int answer;
    static class Point{
        int x;
        int y;
        int cnt;
        Point(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    static void bfs(Point point){
        Queue<Point> que = new LinkedList<>();
        que.add(point);
        while(!que.isEmpty()){
            Point pre = que.poll();
            if(pre.cnt > answer) continue;
            if(pre.x == target[0] && pre.y == target[1]){
                answer = Math.min(pre.cnt, answer);
                return;
            }
            for(int dir = 0; dir < 4; dir++){
                int nr = pre.x + dirs[dir][0];
                int nc = pre.y + dirs[dir][1];
                if(nr >= 0 && nr < map.length && nc >= 0 && nc < map[0].length && !visited[nr][nc] && map[nr][nc] == 1){
                    Point next = new Point(nr, nc, pre.cnt + 1);
                    visited[nr][nc] = true;
                    que.add(next);

                }
            }
        }
    }
    static public int solution(int[][] maps) {

        answer = maps.length * maps[0].length + 1;
        map = maps.clone();
        visited = new boolean[maps.length][maps[0].length];
        target = new int[2];
        target[0] = maps.length-1;
        target[1] = maps[0].length -1;

        bfs(new Point(0,0,1));
        if(answer == maps.length * maps[0].length+1){
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }
}