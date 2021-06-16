package 소수만들기;
import java.util.*;
class Solution {
    static boolean[] prime;
    static boolean[] visited;
    static int[] numArray;
    static int result;
    static void comb(int idx, int s_idx, int sum){
        if(s_idx == 3){
            if(!prime[sum]) result++;
            return;
        }
        if(idx == visited.length){
            return;
        }

        comb(idx+1, s_idx, sum);
        visited[idx] = true;
        comb(idx+1, s_idx + 1, sum+numArray[idx]);
    }
    public int solution(int[] nums) {
        int answer = -1;
        result = 0;
        //소수 만드는 부분
        prime = new boolean[3001];
        for(int i = 2 ;i  < Math.sqrt(3001); i++){
            for(int j = 2; i * j < 3001; j++){
                prime[i * j] = true;
            }
        }
        numArray = nums;
        visited = new boolean[nums.length];
        comb(0,0,0);

        return result;
    }
}