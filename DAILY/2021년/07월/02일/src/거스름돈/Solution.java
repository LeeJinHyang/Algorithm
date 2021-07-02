package 거스름돈;
import java.util.*;
class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        long div = 1000000007;
        Arrays.sort(money);
        long[] dp = new long[n+1];
        for(int i = 0; i <= n ; i++){
            if(i % money[0] == 0){
                dp[i] = 1;
            }
        }
        for(int i = 1; i < money.length; i++){
            for(int N = money[i]; N <= n; N++){
                dp[N] += dp[N - money[i]] ;

            }
        }

        return (int)(dp[n] % div);
    }
}