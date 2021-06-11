package 위장;

import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        //의상의 이름
        //의상의 종ㄿ
        Map <String, List<String>> clothMap = new HashMap();
        for(String[] str : clothes){
            if(!clothMap.isEmpty() && clothMap.containsKey(str[1])){
                List<String> list = clothMap.get(str[1]);
                list.add(str[0]);
                clothMap.put(str[1], list);
            }
            else {
                List<String> list = new LinkedList();
                list.add(str[0]);
                clothMap.put(str[1], list);

            }
        }
        for (Map.Entry<String, List<String>> entry : clothMap.entrySet()) {
            List<String> list = entry.getValue();
            answer *= (list.size() +1);
        }
        return answer -1;
    }
}
