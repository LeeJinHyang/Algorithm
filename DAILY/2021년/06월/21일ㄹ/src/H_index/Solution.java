package H_index;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //n편중 h번 이상 인용된 논문이 h번이상 나며지 논문인
        int over = 0;
        int under = 0;
        int cnt = 0;
        int max = 0;
        while(true){
            for(int num : citations){
                if(num >= cnt) {
                    over++;
                }
                if(num <= cnt){
                    under++;
                }
                max = Math.max(max, num);
            }
            if(over >= cnt){
                answer = cnt;
            }
            cnt++;
            if(max < cnt) break;
            over = 0;
            under = 0;
        }
        return answer;
    }
}