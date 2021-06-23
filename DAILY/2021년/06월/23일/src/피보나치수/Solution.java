package 피보나치수;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int Num = 1234567;
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <=n;i++){
            fibo[i] = (fibo[i-1]%Num + fibo[i-2]%Num) % Num;
        }
        return fibo[n];
    }
}