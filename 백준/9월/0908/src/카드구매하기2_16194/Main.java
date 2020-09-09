package 카드구매하기2_16194;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[1001];
		for(int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[1001];
		Arrays.fill(dp,10000);
		dp[0] = 0;
		for(int i = 1; i <= N;i++ ) {
			for(int j = 1; j <= i; j++ ) {
				dp[i] = Math.min(dp[i],dp[i-j]+arr[j]);
			}
			
		}
		System.out.println(dp[N]);		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}

}
