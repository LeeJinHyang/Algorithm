package 위장;

import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> map = new HashMap();
        for(String[] str : clothes){
            if(!map.containsKey(str[1])){
                List<String> list = new ArrayList();
                list.add(str[0]);
                map.put(str[1], list);
            }else{
                List<String> list = map.get(str[1]);
                list.add(str[0]);
                map.put(str[1], list);
            }
        }
        for(List<String> value: map.values()){
            answer = answer * (value.size() + 1);
        }
        return answer - 1;
    }
}