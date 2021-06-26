package n2타일링2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int div = 10007;
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i < n+1; i++){
            dp[i] = (dp[i-1] % div + (2 * dp[i-2]) % div) % div;
        }
        System.out.println(dp[n]);
    }
}
