package num3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    static int num;
    static int maxLength;
    static int targetNum;
    static List<Integer> resultList;
    static void Comb(int idx, int num, List<Integer> list, int depth){
        if(num > targetNum) return;
        if(idx > targetNum) return;

        if(num == targetNum){
            if(depth > maxLength) {
                maxLength = depth;
                resultList = list;
          }
            return;
        }
        List<Integer> lists = new ArrayList<>(list);
        lists.add(idx);
        Comb(idx+2, num+ idx,lists , depth + 1 );
        Comb(idx+2, num, list, depth);

    }
    static public int[] solution(int N) {
        // write your code in Java SE 8
        //최대 각각 다른 홀수로만 이뤄진 합으로 만드는 문제
        //가장 작은 숫자부터 시작하는게 이득이다
        //1 -> 3-> 5 -> 으로 조합해서
        targetNum = N;
        Comb(1,0,new ArrayList<>(), 0);
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            answer[i] = resultList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(8);
    }
}
