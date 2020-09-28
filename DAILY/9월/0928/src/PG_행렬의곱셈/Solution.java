package PG_행렬의곱셈;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int R = arr1.length;
        int C = arr2[0].length;
        int range = arr2.length;
        int[][] answer = new int[R][C];
        
        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                int num = 0;
                for(int idx = 0; idx < range; idx++){
                    num += arr1[r][idx] * arr2[idx][c];
                }
                answer[r][c] = num;
            }
        }
        return answer;
    }
}