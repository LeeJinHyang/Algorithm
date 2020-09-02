package µ¿Àü1_2293;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dp = new int[k+1];
		dp[0] = 1;
		for(int i = 0; i < n;i++) {
			int coin = sc.nextInt();
			for(int j = 1; j < k+1; j++) {
				if(j >= coin) dp[j] += dp[j -coin];
			}
			
		}
		System.out.println(dp[k]);
		
	}

}
