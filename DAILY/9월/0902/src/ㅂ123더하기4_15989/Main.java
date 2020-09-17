package §≤123¥ı«œ±‚4_15989;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[][] dp = new int[10001][4];
			dp[1][1] = 1;
			dp[2][1] = 1;
			dp[2][2] = 1;
			dp[3][1] = 1;
			dp[3][2] = 1;
			dp[3][3] = 1;
			for(int i = 2; i < n+1; i++) {
				dp[i][1] = dp[i-1][1];
				if(i > 2) {
					dp[i][2] = dp[i-2][1]+dp[i-2][2];
				}
				if(i > 3) {
					dp[i][3] = dp[i-3][1] + dp[i-3][2]+dp[i-3][3];
				}
			}
			System.out.println(dp[n][1]+dp[n][2]+dp[n][3]);
		
		}
	}
}
