package µ¿Àü2_2294;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n];
		int[] dp = new int[k+1];
		for(int i = 0; i < n; i ++) {
			coin[i] = sc.nextInt();
		}
		Arrays.fill(dp, 10001);
		Arrays.sort(coin);
		dp[0] = 0;
		for(int i = 0;i <n; i++ ) {
			int coins = coin[i];
			for(int c =coins; c < k+1; c++) {
				dp[c] = Math.min(dp[c], dp[c-coins]+1);
			}
		}
		if(dp[k] == 10001) System.out.println("-1");
		else System.out.println(dp[k]);
		
	}

}
