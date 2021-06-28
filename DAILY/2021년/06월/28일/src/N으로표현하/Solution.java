package N으로표현하;

import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        if(number == 0) return 0;
        List<List<Integer>> dp = new LinkedList<>();
        for(int i = 0; i < 9; i++){
            dp.add(new LinkedList<>());


        }
        int num = 0;
        for(int i = 1; i <= 8; i++){
            num = num * 10 + N;
            if(num == number) return i;
            dp.get(i).add(num);

        }

        for(int i = 2; i <= 8 ; i++){
            answer = i;
            //NN형식 추가
            for(int x = 1; x < i; x++){
                int y = i - x;
                for(int num1 : dp.get(x)){
                    for(int num2 : dp.get(y)){
                        dp.get(i).add(num1+num2);
                        dp.get(i).add(num1-num2);
                        dp.get(i).add(num1*num2);
                        if(num2 != 0){
                            dp.get(i).add(num1/num2);
                        }
                    }
                }
            }
            if(dp.get(i).contains(number)){
                break;
            }
        }
        if(answer >= 8) return -1;
        return answer;
    }
}