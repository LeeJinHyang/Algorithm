package 정수삼각;


import java.util.*;

public class Solution {

    public int solution(int[][] triangle) {
        int answer = 0;
        //맨 위부터 각각 모든 경로 탐색
        int max = -1;
        int num = triangle.length;
        int[][] DP = new int[num][num];
        DP[0][0] = triangle[0][0];
        for(int x = 1; x < num; x ++){
            for(int y = 0; y <= x; y++){
                if(y == 0){
                    DP[x][y] = triangle[x][y] + DP[x -1][y];
                }else if(y == x){
                    DP[x][y] = triangle[x][y] + DP[x-1][y-1];

                }else{
                    int temp = Math.max(DP[x-1][y-1], DP[x-1][y]);
                    DP[x][y] = triangle[x][y] + temp;
                }
            }
        }
        for(int i = 0 ; i <num; i++){
            max = Math.max(DP[num-1][i] , max);
        }
        return max;
    }
}