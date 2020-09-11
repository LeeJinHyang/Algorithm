package 가장긴증가하는부분수열_11053;

import java.util.Arrays;
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
		Arrays.fill(dp, 1);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <i ; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i],dp[j]+1 );
				}
			}
		}
		int max = 0;
		for(int i = 0; i < N; i++) max = Math.max(max, dp[i]);
		System.out.println(max);
	}

}
