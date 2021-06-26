package 땅따먹기;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][land[0].length];
        //초기화 해주는 부분
        for(int j = 0; j < land[0].length; j++){
            dp[0][j] = land[0][j];
        }
        //dp값을 넣기 시작한다
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                int max = 0;
                for(int tmp = 0; tmp < land[0].length; tmp++){
                    if(j == tmp) continue;
                    max = Math.max(max, dp[i-1][tmp]);
                }
                dp[i][j] = max + land[i][j];
            }
        }
        for(int i = 0; i < land[0].length; i++){
            answer = Math.max(answer, dp[land.length - 1][i]);
        }
        return answer;
    }
}