package 스킬테스1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int min;
    static int[] rd = {0,0,1,-1};
    static int[] cd = {1,-1,0,0};
    static int[][] map;
    static boolean[][] visited;
    static class Point{
        int x;
        int y;
        int dir;
        int money;
        Point(){}
        Point(int x, int y, int dir, int money){
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.money = money;
        }

    }
    public void BFS(Queue<Point> que){
        while(!que.isEmpty()){
            Point fr = que.poll();
            visited[fr.x][fr.y] = true;
            if(fr.money >= min){
                continue;
            }
            if(fr.x == map.length -1 && fr.y == map[0].length-1){
                System.out.println(fr.money);

                min = Math.min(min, fr.money);

            }
            for(int dir = 0; dir < 4; dir++){
                int nr = rd[dir] + fr.x;
                int nc = cd[dir] + fr.y;
                if(nr >= 0 && nr < map.length && nc >= 0 && nc < map[0].length
                        && map[nr][nc]==0 && !visited[nr][nc]){
                    int plus = 0;
                    if(fr.dir == -1 ||fr.dir == dir){
                        plus = 100;
                    }
                    else {
                        plus = 600;
                    }
                    Point next = new Point(nr, nc, dir, fr.money+plus);
                    que.add(next);
                }
            }
        }
    }
    public int solution(int[][] board){
        int answer = 0;
        map = new int[board.length][board[0].length];
        visited = new boolean[board.length][board[0].length];
        min = Integer.MAX_VALUE;
        for(int i = 0; i < board.length; i++){
            map[i] = Arrays.copyOf(board[i], board[i].length);
        }
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(0,0,-1,0));
        BFS(que);
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {

    }
}
