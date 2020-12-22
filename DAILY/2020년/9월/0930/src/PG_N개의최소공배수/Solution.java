package PG_N개의최소공배수;

class Solution {
    public int solution(int[] arr) {
        int num = arr[0];
        for(int i = 1; i < arr.length; i++){
            int gcd = GCD(num, arr[i]);
            num = num / gcd * arr[i] / gcd * gcd;
        }
        
        return num;
    }
    static int GCD(int num1, int num2){
        if(num1 % num2 == 0) return num2;
        else{
            return GCD(num2, num1 % num2);
        }
    }
}