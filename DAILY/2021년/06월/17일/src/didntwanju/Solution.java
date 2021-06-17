package didntwanju;

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        int j = 0;
        while(i < participant.length && j < completion.length){

            if(participant[i].equals(completion[j])){
                i ++;
                j++;
            }
            else{
                answer = participant[i];
                i++;
            }
        }
        if(answer.equals("")) answer = participant[i];
        return answer;
    }
}