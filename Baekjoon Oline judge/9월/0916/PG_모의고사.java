import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] st1 = {1,2,3,4,5}; 
        int[] st2 = {2,1,2,3,2,4,2,5};
        int[] st3 = {3,3,1,1,2,2,4,4,5,5};
        int[] idx = new int[3];
        int[] count = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(idx[0] == 5) idx[0] = 0;
            if(idx[1] == 8) idx[1] = 0;
            if(idx[2] == 10) idx[2] = 0;
            
            if(st1[idx[0]] == answers[i]) count[0]++;
            if(st2[idx[1]]== answers[i]) count[1]++;
            if(st3[idx[2]] == answers[i]) count[2]++;
            
            idx[0]++;
            idx[1]++;
            idx[2]++;
        }
        int max = 0;
        for(int i =0; i < 3; i++){
            max = Math.max(max, count[i]);
        }
        int ans_idx = 0;
        int[] answerTemp = new int[3];
        for(int i =0; i < 3; i++){
            System.out.println(count[i]);
            if(max == count[i]){
                answerTemp[ans_idx] = i+1;
                ans_idx++;
            } 
        }
        
        answer = new int[ans_idx];
        for(int i = 0; i < ans_idx; i++){
            if(answerTemp[i]!=0){
                answer[i] = answerTemp[i];
            }
        }
        
        
        return answer;
    }
}