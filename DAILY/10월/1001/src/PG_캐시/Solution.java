package PG_캐시;

import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return cities.length * 5;
        
        //DEQUE를 이용한 문제
        Deque<String> deque = new ArrayDeque();
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i];
            city = city.toLowerCase();
            if(!deque.contains(city)){ // 해당 값이 존재 안하는 경우, 만일 해시가 꽉 차있다면 마지막 껄 제거하고 안찼다면 맨 위에 넣어준다
                //이미 여기 온 이상 cache miss 이다
                answer += 5;
                if(deque.size() == cacheSize){ //꽉 찬 경우
                    deque.pollLast();
                    deque.push(city);
                    
                }
                else{ //아직 안찬경우
                    deque.push(city);
                }
                
            }
            
            else{ //해당 값이 존재하는 경우
                //값이 존재하는 경우 해당하는 값을 삭제하고 가장 위에 넣어주면 된다
                //cache hit
                answer += 1;
                deque.remove(city);
                deque.push(city);
                
            }
        }
        return answer;
    }
}