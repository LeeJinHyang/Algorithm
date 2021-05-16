package 행;

public class Solution {
    static int[][] map;
    static public void view(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
            System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    static public int rotation(int x1, int y1, int x2, int y2){
        int base = map[x1][y1];
        int min = base;
        //4번부터 돌아간다
        int d = 0;
        for(int y = y1; y < y2; y++){
//            System.out.println(d+" "+x1 +" "+ y);
            d++;
           map[x1][y] = map[x1][y+1];
            min = Math.min(min, map[x1][y]);
        }
        view();
        d= 0;
        for(int x = x1; x < x2; x++){
//            System.out.println(d+" "+x +" "+ y2);
            d ++;
            map[x][y2] = map[x+1][y2];
            min = Math.min(min, map[x][y2]);
        }
        for(int y = y2; y > y1; y--){
//            System.out.println(x2 +" "+ y);
            map[x2][y] = map[x2][y-1];
            min = Math.min(min, map[x2][y]);
        }
        for(int x = x2; x > x1; x--){
//            System.out.println(x +" "+ y1);
            map[x][y1] = map[x-1][y1];
            min = Math.min(min, map[x][y1]);
        }
        view();
        map[x1+1][y1] = base;
        System.out.println("!!!!!!!!!!!!!!!! :    "+ min );
        return min;
    }


    //테두리 부분의 숫자들을 시계방향으로 회전시킨다
    
    //(x1, y1, x2, y2)
    //해당하는 직사각형이 있다고 생각하고 해당 직사각형을 시계방향으로 회전해주는 함수를 만든다
    static public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        map = new int[rows][columns];
        int nums = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                map[i][j] = nums;
                nums ++;
            }
        }
        int idx = 0;
        for(int[] arr : queries){
            int num = rotation(arr[0] -1,arr[1]-1,arr[2]-1, arr[3]-1);
            answer[idx] = num;
            idx ++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        solution(6,6,arr);
    }
}
