package 디스크컨트롤;
import java.util.*;

public class SolutionClassSort {
    static class Job implements Comparable<Job>{
        int startTime;
        int executionTime;

        public Job(int startTime, int executionTime){
            this.startTime = startTime;
            this.executionTime = executionTime;
        }
        public int getExecutionTime(){
            return executionTime;
        }
        public int getStartTime(){
            return startTime;
        }

        @Override
        public int compareTo(Job o) {
            return getExecutionTime() - o.getExecutionTime();
        }

    }
    public int solution(int[][] jobs) {
        int answer = 0;
        int num =jobs.length;
        //작업의 요청ㅇ부터 종료까지 걸린 시간의 평균을 줄이는 방법
        //한 작업이 끝났을 때 그 순간에 가장 작은 작업부터 수행
        List<Job> jobList = new ArrayList();
        List<Job> schedule = new ArrayList();
        for(int i = 0; i < jobs.length; i++){
            int[] job = jobs[i];
            Job tmp = new Job(job[0], job[1]);
            jobList.add(tmp);
        }
        int idx = 0;
        int time = 0;
        while(!(jobList.isEmpty() && schedule.isEmpty()) ){
            //jobList 돌면서 해당 Time에 시작가능한 Job이 있는 경우에 Schedule에 add
            while(!jobList.isEmpty()){
                Job jd = jobList.get(0);

                if(jd.getStartTime() <= time){
                    schedule.add(jd);
                    jobList.remove(0);

                }
                else{
                    break;
                }

            }
            if(!schedule.isEmpty()){
                //해당 schedule.isEmpty가 아니면 sort
                //schedule의 맨 앞의 작업의 time = ExecutionTime + time
                //수행 후 jobList.remove(0)

                Collections.sort(schedule);
                Job nextJob = schedule.get(0);
                time += nextJob.getExecutionTime();
                answer += time - nextJob.getStartTime();
                schedule.remove(0);
            }

            else{
                //만약 아무런 작업도 없는 경우 time ++;
                //schedule.isEmpty() 인 경우 time ++;
                time++;
            }
        }

        return answer/num;
    }
}