package 합승택시요금;

import java.util.*;

public class Solution {

    static public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        int[][] map = new int[n+1][n+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                map[i][j] = 100000;
            }
            map[i][i] = 0;
        }
        for(int[] arr : fares){
            map[arr[0]][arr[1]] = arr[2];
            map[arr[1]][arr[0]] = arr[2];
        }
        //start -> a
        // start -> b로 이동해야 한다

        //A와 B가 같이 최대한 갈 수 있는 거리 계산
        //만약 A가 같이 가는 길ㅇ

        for(int k = 1; k < n+1; k++){
            for(int i = 1; i < n+1; i++){
                for(int j = 1; j < n+1; j ++){
                    if(map[i][j] > map[i][k] + map[k][j]){
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }


        int min = map[s][a] + map[s][b];
        for(int i = 1; i < n; i++){
            min = Math.min(min, map[s][i] + map[i][a] + map[i][b]);
        }
        return min;
    }



    public static void main(String[] args) {
        int[][] fares = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
        int s = solution(6, 4,6,2, 	fares);
        System.out.println(s);
    }
}
