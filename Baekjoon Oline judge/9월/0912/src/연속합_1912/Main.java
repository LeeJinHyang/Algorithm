package 연속합_1912;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		dp[0] = arr[0];
		for(int i = 1; i < N; i++ ) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			max = Math.max(max , dp[i]);
		}
		System.out.println(max);
	}

}
