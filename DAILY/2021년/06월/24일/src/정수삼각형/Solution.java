package 정수삼각형;

import java.util.*;
class Solution {
    static class Point{
        int i;
        int j;
        int sum;
        Point(int i , int j, int sum){
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }
    public int solution(int[][] triangle) {
        int answer = 0;
        List<int[]> map = new LinkedList<>();
        int[] array = new int[1];
        array[0] = triangle[0][0];
        map.add(array);
        for(int i = 1; i < triangle.length; i++){
            array = new int[i+1];
            int[] pre = map.get(i-1);
            for(int j = 0; j <= i; j++){
                if(j == 0){//맨 위
                    array[j] = pre[0] + triangle[i][j];
                }else if(j == i){ //맨 아래
                    array[j] = pre[j-1] + triangle[i][j];
                }else{
                    array[j] = Math.max(pre[j] , pre[j-1]) + triangle[i][j];
                }
            }
            map.add(array);
        }
        int[] result = map.get(map.size() - 1);
        answer = result[0];
        for(int i = 1; i < result.length; i++){
            answer = Math.max(answer, result[i]);
        }
        System.out.println();
        return answer;
    }
}