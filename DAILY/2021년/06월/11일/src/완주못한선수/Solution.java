package 완주못한선수;

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int j = 0;
        for(int i = 0; i < participant.length; i++ ){
            if(j >= completion.length) break;
            if(participant[i].equals(completion[j])){
                j++;
            }else{
                answer = participant[i];
            }
        }
        if(answer == "") answer = participant[participant.length -1];
        return answer;
    }
}