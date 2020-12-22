package PG_ĳ��;

import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return cities.length * 5;
        
        //DEQUE�� �̿��� ����
        Deque<String> deque = new ArrayDeque();
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i];
            city = city.toLowerCase();
            if(!deque.contains(city)){ // �ش� ���� ���� ���ϴ� ���, ���� �ؽð� �� ���ִٸ� ������ �� �����ϰ� ��á�ٸ� �� ���� �־��ش�
                //�̹� ���� �� �̻� cache miss �̴�
                answer += 5;
                if(deque.size() == cacheSize){ //�� �� ���
                    deque.pollLast();
                    deque.push(city);
                    
                }
                else{ //���� �������
                    deque.push(city);
                }
                
            }
            
            else{ //�ش� ���� �����ϴ� ���
                //���� �����ϴ� ��� �ش��ϴ� ���� �����ϰ� ���� ���� �־��ָ� �ȴ�
                //cache hit
                answer += 1;
                deque.remove(city);
                deque.push(city);
                
            }
        }
        return answer;
    }
}