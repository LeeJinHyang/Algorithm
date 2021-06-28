package 디스크컨트롤러;

import java.util.*;
class Solution {
    static class Work{
        int arrivalTime;
        int taskTime;
        Work(int arrivalTime, int taskTime){
            this.arrivalTime = arrivalTime;
            this.taskTime = taskTime;
        }

    }
    static public int calTime(int time, Work work){
        return time+work.taskTime - work.arrivalTime;
    }
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Work> waitQue = new PriorityQueue<>(new Comparator<Work>(){
            @Override
            public int compare(Work work1, Work work2){
                return work1.taskTime - work2.taskTime;
            }
        });
        PriorityQueue<Work> jobsQue = new PriorityQueue<>(new Comparator<Work>(){
            @Override
            public int compare(Work work1, Work work2){
                if(work1.arrivalTime == work2.arrivalTime)
                {
                    return work1.taskTime - work2.taskTime;

                }
                else {
                    return work1.arrivalTime - work2.arrivalTime;

                }
            }
        });
        for(int[] job : jobs){
            jobsQue.add(new Work(job[0], job[1]));
        }
        int time = 0;
        while(!jobsQue.isEmpty() || !waitQue.isEmpty()){
            //일단 뺀다
            if(!waitQue.isEmpty()){
                Work next = waitQue.poll();
                answer += calTime(time, next);
                time = time + next.taskTime;

            }else{
                Work work = jobsQue.peek();
                time = work.arrivalTime;
            }
            while(!jobsQue.isEmpty()){
                Work work = jobsQue.peek();
                if(work.arrivalTime > time){
                    break;
                }
                else{
                    jobsQue.poll();
                    waitQue.add(work);
                }
            }
        }
        return answer/jobs.length;
    }
}