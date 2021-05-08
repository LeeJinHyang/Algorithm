package num2;

public class Solution {
    static int[][] dirs = {{0,1},{0,-1},{1,0},{-1, 0},{1,1},{1, -1},{-1,1},{-1,-1}};
    static boolean check(char[][] map, int r, int c){
        boolean flag = true;
        //dir 0 ~ 3
        for(int dir = 0; dir < 4; dir ++){
            for(int s = 1; s < 3; s++){
                int nr = r + dirs[dir][0] * s;
                int nc = c + dirs[dir][1] * s;
                if(nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && map[nr][nc] == 'P'){
                    return false;
                }
                else if(nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && map[nr][nc] == 'X'){
                    break;
                }

            }

        }
        //dir 4 ~ 7

        for(int dir = 4; dir < 8; dir ++){

            int nr = r + dirs[dir][0];
            int nc = c + dirs[dir][1];
            if(nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && map[nr][nc] == 'P'){
                //가는 길이 파티션이 없는경우만 false를 보내야 한다
                if(dir == 4){
                    if(nr-1 >= 0 && nr-1 < 5 && nc >= 0 && nc < 5 && map[nr-1][nc] == 'O'){
                        return false;
                    }
                    if(nr >= 0 && nr < 5 && nc-1 >= 0 && nc-1 < 5 && map[nr][nc-1] == 'O'){
                        return false;
                    }
                }else if(dir == 5){
                    if(nr-1 >= 0 && nr-1 < 5 && nc >= 0 && nc < 5 && map[nr-1][nc] == 'O'){
                        return false;
                    }
                    if(nr >= 0 && nr < 5 && nc+1 >= 0 && nc+1 < 5 && map[nr][nc+1] == 'O'){
                        return false;
                    }
                }else if(dir == 6){

                    if(nr+1 >= 0 && nr+1 < 5 && nc >= 0 && nc < 5 && map[nr+1][nc] == 'O'){
                        return false;
                    }
                    if(nr >= 0 && nr < 5 && nc-1 >= 0 && nc-1 < 5 && map[nr][nc-1] == 'O'){
                        return false;
                    }
                }else if(dir == 7){

                    if(nr+1 >= 0 && nr+1 < 5 && nc >= 0 && nc < 5 && map[nr+1][nc] == 'O'){
                        return false;
                    }
                    if(nr >= 0 && nr < 5 && nc+1 >= 0 && nc+1 < 5 && map[nr][nc+1] == 'O'){
                        return false;
                    }
                }

            }



        }

        return true;
    }
    static public boolean mapCheck(String[] places){

        char[][] map = new char[5][5];
        for(int i = 0 ; i < 5; i++){
            for(int j = 0 ; j < 5; j++){
                map[i][j] = places[i].charAt(j);
            }
        }

        for(int i = 0 ; i < 5; i++){
            for(int j = 0 ; j < 5; j++){
                if(map[i][j] == 'P'){
                    if(!check(map, i, j)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        //p는 응시자 자리
        //O는 빈테이블
        //X는 파티션ㅇ ㅢ미
        for(int i = 0; i < 5; i++){
            if(mapCheck(places[i])){
                answer[i] = 1;
            }
            else {
                answer[i] = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
