package 행렬테두리회전;
import java.util.*;
class Solution {
    static int[][] map;
    static public void print(int x1, int y1, int x2, int y2){
        for(int x = 0; x < map.length; x++){
            for(int y = 0; y < map[0].length; y++){
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static public int lotation(int x1, int y1, int x2, int y2){
        int pivot = map[x1][y1];
        int min = pivot;
        for(int x = x1; x <x2; x++){
            map[x][y1] = map[x+1][y1];
            min = Math.min(map[x][y1], min);
        }
        for(int y = y1; y < y2; y++){
            map[x2][y] = map[x2][y+1];
            min = Math.min(map[x2][y] , min);
        }
        for(int x = x2; x > x1; x--){
            map[x][y2] = map[x-1][y2];
            min = Math.min(map[x][y2], min);
        }

        for(int y = y2; y > y1+1; y--){
            map[x1][y] = map[x1][y-1];
            min = Math.min(map[x1][y], min);
        }

        map[x1][y1+1] = pivot;
        // print(x1,y1,x2,y2);
        return min;
    }
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 1;
        //map 만드는 부분
        map = new int[rows][columns];
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < columns; j++){
                map[i][j] = num;
                num++;
            }
        }
        for(int od = 0; od < queries.length; od++){
            int[] order = queries[od];
            int x1 = order[0]-1;
            int y1 = order[1]-1;
            int x2 = order[2]-1;
            int y2 = order[3]-1;
            int nums = lotation(x1,y1,x2,y2);
            answer[od] = nums;
        }
        return answer;
    }
}
