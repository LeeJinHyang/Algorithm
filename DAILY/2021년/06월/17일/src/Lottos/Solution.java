package Lottos;
import java.util.*;
class Solution {
    static public int lottoRanking(int num){
        if(num == 6) return 1;
        else if(num == 5) return 2;
        else if(num == 4) return 3;
        else if(num == 3) return 4;
        else if(num == 2) return 5;
        else return 6;
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList();

        for(int num : win_nums){
            list.add(num);
        }
        int now = 0;
        int question = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) {
                question ++;
                continue;
            }
            if(list.contains(lottos[i])){
                now++;
                continue;
            }

        }
        answer = new int[2];
        answer[0] = lottoRanking(now + question);
        answer[1] = lottoRanking(now);

        return answer;
    }
}