import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        /*입력의 맨 첫 줄에는 총 테스트 케이스의 개수 T가 주어지고, 그 다음 줄부터 T개의 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 1일 이용권의 요금, 1달 이용권의 요금, 3달 이용권의 요금, 1년 이용권의 요금이 순서대로 한 칸씩 띄고 주어진다.

그 다음 줄에는 1월부터 12월까지의 이용 계획이 주어진다.
        */
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int oneDayPrice = sc.nextInt();
            int oneMonthPrice = sc.nextInt();
            int threeMonthPrice = sc.nextInt();
            int oneYearPrice = sc.nextInt();


            int[] plan = new int[13];
            for(int i = 1; i <= 12; i++){
                plan[i] = sc.nextInt();
            }

               
                //dp를 이용해서 푼다
                int[][] dp = new int[13][4];
                //하루 계산
                for(int month = 1; month <= 12; month++){
                    dp[month][0] = plan[month] * oneDayPrice + dp[month-1][0];
                }
                //한달 계산
                for(int month = 1; month <= 12; month++){
                    if(plan[month] == 0) dp[month][1] = dp[month-1][1];
                    else {
                        int money = Math.min(plan[month] * oneDayPrice, oneMonthPrice);
                        dp[month][1] = Math.min(dp[month][0], dp[month-1][1] + money);
                }
            }
                //세달 계산
                for(int month = 3; month <= 12; month++){
                    if(plan[month] == 0) dp[month][2] = dp[month-1][2];
                    else{                    
                        int money = Math.min(oneMonthPrice * 3, threeMonthPrice);
                        dp[month][2] = Math.min(dp[month-3][2] + money , dp[month][1]);

                    }
                }
                //일년 계산
                dp[12][3] = Math.min(dp[12][2], oneYearPrice);

                for(int i = 0; i < 4; i++){
                    for(int j = 1; j <= 12; j++){
                        System.out.print(dp[j][i]+" ");
                    }
                    System.out.println();
                }
                System.out.println("#"+tc+" " +dp[12][3]);

        }
    }
}
