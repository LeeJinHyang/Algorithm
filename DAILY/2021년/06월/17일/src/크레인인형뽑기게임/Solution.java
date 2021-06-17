package 크레인인형뽑기게임;

import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //map을 두고
        //list로 최대 인덱스를 넣는다
        int[] index = new int[board[0].length];
        // System.out.println(board[0].length);
        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != 0){
                    // System.out.println(i+" "+j);
                    index[i] = j;
                    break;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int move : moves){
            int idx = move - 1;

            if(index[idx] >= board.length) continue;

            int num = board[index[idx]][idx];

            board[index[idx]][idx] = 0;

            // System.out.println(move -1);
            // System.out.println(index[move -1]);
            index[move - 1] ++;
            if(!stack.isEmpty() && num != 0 && stack.peek() == num ){
                answer += 2;
                stack.pop();
            }else{
                stack.push(num);
            }

        }
        return answer;
    }
}