package 길찾기다이아몬드;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> list = new LinkedList<>();
        String input = br.readLine();
        //1 ~ n개의 삼각형을 만들고
        for(int i = 0; i < Integer.parseInt(input); i++){
            String[] tmp = 	br.readLine().split(" ");
            List<Integer>  arr = new LinkedList<>();
            for(String str : tmp){
                arr.add(Integer.parseInt(str));
            }
            list.add(arr);
        }
        for(int i = Integer.parseInt(input); i < Integer.parseInt(input)*2 -1; i++){
            String[] tmp = 	br.readLine().split(" ");
            List<Integer>  arr = new LinkedList<>();
            for(String str : tmp){
                arr.add(Integer.parseInt(str));
            }
            list.add(arr);
        }


        //리스트 거꾸로 가는 arr를 만든다
        //dp문제로 푼다
        int[][] dp = new int[Integer.parseInt(input)*2][Integer.parseInt(input)];
        dp[0][0] = list.get(0).get(0);
        for(int i = 1; i < Integer.parseInt(input); i++){
            for(int j = 0; j <= i; j++ ){
                if(j == 0){
                    dp[i][j] = dp[i-1][j]+ list.get(i).get(j);
                }else if(j == i){
                    dp[i][j] = dp[i-1][j-1]+ list.get(i).get(j);
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1] ) + list.get(i).get(j);
                }
            }
        }
        //n-1의 삼각형을 만든다
        for(int i = Integer.parseInt(input); i < Integer.parseInt(input) * 2 -1 ;  i++){
            for(int j = 0; j < Integer.parseInt(input) * 2 - i-1; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j+1]) + list.get(i).get(j);
            }
        }
        System.out.println(dp[Integer.parseInt(input) * 2 -2][0]);
    }
}