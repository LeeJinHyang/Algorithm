package 타일채우기;

import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int div = Integer.parseInt(inputArr[1]);
        int num = Integer.parseInt(inputArr[0]);
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        for(int i =3; i <= num; i++){
            dp[i] = (dp[i-1] % div + dp[i-2] * 2 % div) % div;
        }
        System.out.println(dp[num]);
    }
}