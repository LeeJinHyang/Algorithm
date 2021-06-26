package 더하기123_2;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int div = 1000000009;
        double[] dp = new double[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <1000001; i++){
            dp[i] = (dp[i-1] % div+ dp[i-2]%div + dp[i-3] % div)%div;
        }
        for(int tc = 0; tc < TC; tc++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
