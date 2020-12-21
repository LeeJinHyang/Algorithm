import java.util.LinkedList;
import java.util.Scanner;

/*첫째 줄에 N(4 ≤ N ≤ 20, N은 짝수)이 주어진다. 
둘째 줄부터 N개의 줄에 S가 주어진다. 
각 줄은 N개의 수로 이루어져 있고, i번 줄의 j번째 수는 Sij 이다. 
Sii는 항상 0이고, 나머지 Sij는 1보다 크거나 같고, 100보다 작거나 같은 정수이다.
*/

public class Solution{
    static int[] player;
    static boolean[] visited;
    static int min;
    static int N;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N;j++){
                map[i][j] = sc.nextInt();
            }
        }
        

        //최소 차이를 만들기 위해서는 모든 경우의 수를 다 해봐야 한다
        min = Integer.MAX_VALUE;
        player = new int[N/2];
        
        
        Comb(0,0);

        System.out.println(min);
}
    public static void Comb(int idx,int s_idx){
        if(s_idx == player.length){
            visited = new boolean[N];
        
            for(int i = 0; i < s_idx; i++){
                //true이면 1팀 false이면 2팀이다
                int play = player[i];
                visited[play] = true;
            }
            min = Math.min(min, calc());
            return;
        }
        
        
		if( idx == N)
            return;
    
        player[s_idx] = idx;
        Comb(idx+1, s_idx+1);
        Comb(idx+1, s_idx);
    }



public static int calc(){
    //true인 경우는 1팀 false인 경우는 2팀 
    int team1 = 0;
    int team2 = 0;
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    for(int i = 0; i < N; i++){
        if(visited[i]) list1.add(i);
        else list2.add(i);
    }
    for(int i = 0; i < N/2-1; i++){
        int fplay1 = list1.get(i);
        int fplay2 = list2.get(i);
        for(int j = i+1; j < N/2; j++){
            //team 1인 경우
            int pplay1 = list1.get(j); 
            team1 += map[fplay1][pplay1];
            team1 += map[pplay1][fplay1];
            
            //team 2인 경우
            int pplay2 = list2.get(j);
            team2 += map[fplay2][pplay2];
            team2 += map[pplay2][fplay2];
        
        }
    }
    if (team1 - team2 >= 0) return team1 - team2;
    else return team2 - team1;
}
}