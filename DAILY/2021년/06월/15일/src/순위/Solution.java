package 순위;

import java.util.Arrays;

public class Solution {
    static public int solution(int n, int[][] results){
        int[][] map = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            Arrays.fill(map[i], Integer.MAX_VALUE);
        }
        for(int[] arr : results){
            int win = arr[0];
            int lose = arr[1];
            map[win][lose] = 1;
            map[lose][win] = -1;
        }
        for(int k = 1; k <= n; k ++){
            for(int i = 1; i <= n; i ++){
                for(int j = 1; j <= n; j ++){
                    if(map[i][j] == Integer.MAX_VALUE ){
                        if(map[i][k] == 1 && map[k][j] == 1) map[i][j] = 1;
                        if(map[i][k] == -1 && map[k][j] == -1) map[i][j] = -1;
                    }
                }
            }
        }
        int answer = 0;

        for(int i = 1; i <= n; i++){
            boolean flag = false;
            for(int j = 1; j <= n; j++){
                if(i!=j &&map[i][j] == Integer.MAX_VALUE) {
                    flag = true;
                    break;
                }
            }
            if(!flag) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
