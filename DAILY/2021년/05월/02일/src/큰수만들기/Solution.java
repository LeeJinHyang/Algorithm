package 큰수만들기;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int num = number.length() - k;
        //n개를 삭제해 가장 큰 수 만들기

        // for i를 0 ~ number.length - num 까지 돌며 가장 큰 수를 찾기
        // 가장 큰 수의 index   부터 0 ~ number.length - num +1 까지 돌며 가장 큰 수 찾기
        //-> num 회 반복
        int startIdx = 0;
        int endIdx = number.length() - num+1;
        for(int i = 0; i < num; i++){
            int idx = findMaxIndex(number, startIdx, endIdx);
            answer += number.charAt(idx);
            startIdx = idx+1;
            endIdx++;
        }


        return answer;
    }
    static int findMaxIndex(String number, int startIdx, int endIdx){
        int idx =startIdx;
        for(int i = startIdx; i < endIdx; i++){
            if(number.charAt(idx) < number.charAt(i)){
                idx = i;
            }
        }
        return idx;
    }
}