package 가장큰증가부분수열_11055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N+1];
		for(int i = 0; i < N; i++) {
			dp[i] = arr[i];
			for(int j = 0; j < i; j++ ) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+arr[i]);
				}
			}
		}
		int max = 0;
		for(int i =0; i < N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
