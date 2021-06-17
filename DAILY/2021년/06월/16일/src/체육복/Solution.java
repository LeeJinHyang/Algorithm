package 체육복;

import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        //모든 학생들 다 1111으로 하고 여벌이 있는 경우 2로 둔다
        //최대한 앞에서부터 검사한다
        int[] student = new int[n+1];
        Arrays.fill(student, 1);
        for(int rs: reserve){
            student[rs] += 1;
        }
        for(int i = 0 ; i < lost.length; i++){
            int idx = lost[i];
            student[idx] --;
            if(student[idx] <= 0 ){
                if(idx > 1 && student[idx - 1] > 1){
                    student[idx-1] --;
                    student[idx]++;
                }
                else if(idx < n && student[idx + 1] > 1){
                    student[idx+1]--;
                    student[idx]++;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(student[i] >= 1) answer ++;
        }
        return answer;
    }
}