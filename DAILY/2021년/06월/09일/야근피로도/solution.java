import java.util.;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        야근 피로도 = (야근시작 시점에서 남은 일의 작업량)^2
        N시간 동안 야근피로도를 최소화하여 일함
        한시간동안 작업량을 1만큼 처리 가능
        
        최대한 작은 수들이 있는게 가장 적은 값을 갖는다
        수를 정렬하고 
        회전하며 빼준다
        int cnt = 0;
         PriorityQueueInteger overtime = new PriorityQueue(Collections.reverseOrder());
        for(int work  works){
            overtime.offer(work);
        }
        while(cnt  n){
            int num = overtime.poll();
            if(num == 0) break;
            num  -= 1;
            overtime.offer(num);
            cnt ++;
        }
    
        for(int work  overtime){
            answer += work  work;
        }
        return answer;
    }
    해당 시간의 작업 피로도 계산
    public long returnNight(int[] works){
        long result = 0;
        for(int work  works){
            result += work  work;
        }
        System.out.println();
        return result;
    }
}