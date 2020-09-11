package §≤123¥ı«œ±‚5_15990;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long max = 1000000009;
		long[][] dp = new long[100001][4];
		dp[1][1] = 1;
		
		dp[2][0] = 0;
		dp[2][2] = 1;
		
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		for(int i = 4; i <= 100000; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3])%max;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3])%max;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2])%max;
		}
		for(int tc = 0; tc <T; tc++) {
			int N = sc.nextInt();
			System.out.println((dp[N][1]+dp[N][2]+dp[N][3])%max);
		}
	}

}
