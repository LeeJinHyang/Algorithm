package num4;

import java.util.LinkedList;

public class Solution {
    static int[][] map;
    static boolean flag; // false면 정방향 true면 역방향'
    static LinkedList<Integer> trap;
    static public void DfS(int idx,int cost, boolean dir){
        //해당 문제는 갔던 곳을 또 방문할 수 있다.
        for(int i =0; i < map.length; i++){
            if(dir) {
                if (map[idx][i] != 0) {
                    if(trap.contains(i)){
                            if(dir) dir = false;
                            else dir = true;
                    }
                    Dfs(i, cost + map[idx][i], dir);
                }
            }else{

            }
        }

    }
    static  public int solution(int n, int start, int end, int[][] roads, int[] traps) {
        int answer = 0;

        // start에서 시작
        // 나에게 올 수 있는 리스트와 나에게 map[][]을 두고
        // 내가 갈 수 있는 곳(a) map[a][]
        // 나에게 오는 곳(a) map[][a]
        //으로 둔다
        map = new int[n+1][n+1];
        for(int[] road : roads){
            //양방향 그래프의 모습이지만
            //내가 갈 수 있는 곳은 map[a]이다
            map[road[0]][road[1]] = road[2];
            map[road[1]][road[0]] = road[2];

        }
        trap = new LinkedList<>();
        for(int tr: traps){
            trap.add(tr);
        }
        // 이후 contains를 이용해 접근이 가능하다

        //DFS를 이용해서 푼다


        return answer;
    }

    public static void main(String[] args) {

    }
}
