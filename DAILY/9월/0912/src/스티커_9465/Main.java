package 스티커_9465;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[2][n];
			for(int i = 0; i < 2; i ++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[][] dp = new int[3][n];
			dp[0][0] = arr[0][0];
			dp[1][0] = arr[1][0];
			dp[2][0] = 0;
			for(int i = 1; i < n; i++) {
				dp[0][i] = Math.max(dp[1][i-1], dp[2][i-1])+ arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[2][i-1])+ arr[1][i];
				dp[2][i] = Math.max(dp[0][i-1], dp[1][i-1]);
				
			}
			int max = Math.max(dp[0][n-1], dp[1][n-1]);
			max = Math.max(max, dp[2][n-1]);
			System.out.println(max);
		}
	}

}
