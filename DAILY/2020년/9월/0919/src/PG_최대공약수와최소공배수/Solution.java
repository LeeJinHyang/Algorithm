package PG_최대공약수와최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcd = GCD(n,m);
        answer = new int[2];
        answer[0] = gcd;
        answer[1] = gcd * (n / gcd) * (m / gcd);
        return answer;
    }
    static int GCD(int n, int m){
        if(n % m != 0) return GCD(m, n%m);
        else return m; 
    }
}