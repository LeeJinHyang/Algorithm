package 포켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        if(numsSet.size() >= nums.length / 2){
            answer = nums.length / 2;
        }
        else{
            answer = numsSet.size();
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
