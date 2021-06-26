package 구명보트;

import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = Arrays.stream(people)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list.size());
        int min = 0;
        int max = people.length -1;
        Arrays.sort(people);
        while(min <= max){
            if(min != max && people[min] + people[max] > limit){
                max --;
                answer ++;
            }
            else{
                max--;
                min++;
                answer++;
            }
        }
        return answer;
    }
}