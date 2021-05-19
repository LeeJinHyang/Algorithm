package 카카오프렌즈컬러링북;

import java.util.*;
class Solution {
    static int max;
    static int count;
    static int[] rd = {0,0,-1,1};
    static int[] cd = {1,-1, 0,0};
    static boolean[][] visited;
    public int[] solution(int m, int n, int[][] picture) {
        max = 0;
        visited = new boolean[m][n];
        //dfs를 통해서 접근한다
        int area = 0;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(!visited[r][c] && picture[r][c] != 0){
                    visited[r][c] = true;
                    count = 1;
                    area ++;
                    dfs(picture, r,c);
                    max = Math.max(max, count);
                }
            }
        }

        // dfs(picture, 1, 0,0);


        int[] answer = new int[2];
        answer[0] = area;
        answer[1] = max;
        return answer;
    }
    static void dfs(int[][] pictures,int x, int y){
        int color = pictures[x][y];
        for(int dir = 0; dir < 4; dir++){
            int rx = rd[dir] + x;
            int cy = cd[dir] + y;

            if(rx >= 0 && rx < pictures.length
                    && cy >= 0 && cy < pictures[0].length
                    && !visited[rx][cy] && pictures[rx][cy] == color){
                visited[rx][cy]= true;
                count ++;
                dfs(pictures , rx, cy);


            }
        }

    }
}