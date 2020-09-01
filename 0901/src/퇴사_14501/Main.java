package Επ»η_14501;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N+15];
		int[] P = new int[N+15];
		int[]dp = new int[N+15];
		for(int i = 0; i <N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		for(int date = N-1; date >=0; date--) {
			if(date + T[date]-1 < N) {
				dp[date] = Math.max(dp[date+T[date]]+P[date], dp[date+1]);
				
			}
			else {
				dp[date] = dp[date+1];
			}
		}
		System.out.println(dp[0]);
		
	}

}
