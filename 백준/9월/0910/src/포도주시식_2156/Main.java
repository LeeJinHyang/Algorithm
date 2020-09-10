package 포도주시식_2156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[10001];
		for(int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] dp = new int[10001];
		dp[1] = arr[1];
		dp[2] = dp[1] + arr[2];
		for(int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
			dp[i] = Math.max(dp[i], dp[i-1]);
		}
		System.out.println(dp[N]);
	}

}
