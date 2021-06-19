package 대진표;

import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int cnt = (int)(Math.log(n) / Math.log(2));
        int num = n;
        int start = 1;
        int end = n;
        while(true){
            if(cnt == 1) return 1;
            boolean flagA = (start+end - 1)/2 >= a ? true : false;
            boolean flagB = (start+end - 1)/2 >= b ? true : false;
            if(flagA != flagB) {
                break;
            }else{
                if(flagA){//앞쪽
                    end = (start+end - 1)/2;
                }else{
                    start = (start+end -1)/2 + 1;

                }
                cnt--;
            }
        }
        return cnt;
    }
}