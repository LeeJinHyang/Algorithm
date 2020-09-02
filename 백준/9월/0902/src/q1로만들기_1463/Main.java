package q1로만들기_1463;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[1000001];
		Arrays.fill(dp, 1000001);
		for(int i = N; i >= 1; i --) {
			if(i % 3 ==0) {
				if(dp[i/3]+1 > dp[i]+1) dp[i/3] = dp[i]+1;
			}
			if(i % 2 == 0) {
				if(dp[i/2]+1 > dp[i]+1) dp[i/2] = dp[i] +1;
			}
			if(dp[i-1] +1 > dp[i]+1) dp[i-1] = dp[i] +1 ;
			
		}
		System.out.println(dp[1]);
	}

}
