package LocalTime;

import com.sun.xml.internal.ws.api.config.management.policy.ManagedServiceAssertion;

import java.time.LocalTime;
import java.util.LinkedList;

public class Solution {
    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        //9:00부터 총n회 t분 간격으로 역에 도착
        //9시 부터 9:00 + t * (1,2,,,,n)
        //m은 한 셔틀에 살 수 있는 최대 크루수
        //콘은 항상 해당 셔틀의 마지막 or 마지막 다음 차를 타고 도착한다
        LocalTime time = LocalTime.of(9,0,0);
        LinkedList<LocalTime> crew = new LinkedList<>();
        for(int i = 0; i < timetable.length; i++){
            String[] crews = timetable[i].split(":");
            crew.add(LocalTime.of(Integer.parseInt(crews[0]), Integer.parseInt(crews[1]), 0));
        }
        for(int i = 0; i < n ; i++){
            for(int num = 0; i < m; i++){
                if(crew.isEmpty()) break;
                if(crew.get(0).isBefore(time)){
                    crew.remove(0);
                }
            }

            time.plusMinutes(t);
            if(crew.isEmpty()){
                break;
            }
        }
        if(time.getHour() < 10 ){
            answer+= "0"+String.valueOf(time.getHour());
        }
        else answer += String.valueOf(time.getHour());
        answer += ":";
        if(time.getMinute() < 10 ){
            answer+= "0"+String.valueOf(time.getMinute());
        }
        else answer += String.valueOf(time.getMinute());
        return answer;
    }
    public static void main(String[] args) {
        String[] arr = {"09:10", "09:09", "08:00"};
        solution(1,1,5,arr);
    }
}
