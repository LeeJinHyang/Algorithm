package 이동하기_11048;

import java.util.Scanner;

public class Main {
	int[] dr = {1,0,1};
	int[] dc = {0,1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			dp[i][0] = dp[i-1][0]+map[i][0];
		}
		for(int i = 1; i <= M; i++) {
			dp[0][i] = dp[0][i-1]+map[0][i];
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				int result = 0;
	            result =Math.max(dp[i-1][j-1],Math.max(dp[i - 1][j], dp[i][j - 1]));
	            dp[i][j] = result + map[i][j];

			}
		}
		System.out.println(dp[N][M]);
		
		
 	}

}
