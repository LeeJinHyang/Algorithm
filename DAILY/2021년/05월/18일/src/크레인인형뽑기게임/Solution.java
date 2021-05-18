package 크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
    static Stack<Integer> stack;
    static public int solution(int[][] board, int[] moves) {
        int answer = 0;
        stack = new Stack<>();
        for(int move : moves){
            int idx = findIt(board, move-1);
            if(idx == -1) continue;
            int num = board[idx][move-1];
            board[idx][move-1] = 0;
            if(stack.size() >= 1 && stack.peek() == num){
                answer += 2;
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        return answer;
    }
    static public int findIt(int[][] board, int idx){
        for(int i = 0; i < board.length; i++){
            if(board[i][idx] != 0){
                return i;
            }
        }
        return -1;
    }
    static public void print(){
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int num = solution(board, moves);
        System.out.println(num);
    }

}
