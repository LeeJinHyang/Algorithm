package 모의고사;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int studentScore1 = 0;
        int studentScore2 = 0;
        int studentScore3 = 0;

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == student1[i%student1.length]) studentScore1++;
            if(answers[i] == student2[i%student2.length]) studentScore2++;
            if(answers[i] == student3[i%student3.length]) studentScore3++;

        }
        int max = Math.max(studentScore1,Math.max(studentScore2,studentScore3));
        List<Integer> score = new LinkedList();
        if(studentScore1 == max) score.add(1);
        if(studentScore2 == max) score.add(2);
        if(studentScore3 == max) score.add(3);
        answer = new int[score.size()];
        for(int i = 0; i < score.size(); i++){
            answer[i] = score.get(i);
        }
        return answer;
    }
}