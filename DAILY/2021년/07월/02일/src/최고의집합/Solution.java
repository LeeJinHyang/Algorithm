package 최고의집합;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int cnt = n;
        for(int i = 0; i < n-1; i++){
            if(s%cnt == 0){
                answer[i] = s/cnt;
                s -= s/cnt;
                cnt--;
            }
            else{
                answer[i] = (int)s/cnt;
                s -= (int)s/cnt;
                cnt --;
            }
        }
        answer[n-1] = s;
        if(answer[0] == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}