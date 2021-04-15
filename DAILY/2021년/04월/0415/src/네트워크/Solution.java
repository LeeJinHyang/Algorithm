package 네트워크;

public class Solution {
    static boolean[] visited;
    static int[][] cmp;
    public static void dfs(int idx){
        int[] tmp = cmp[idx];
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] == 1 && idx != i && !visited[i]){
                visited[i] = true;
                dfs(i);
                
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        cmp = computers;
        for(int i = 0; i < computers.length; i++){
            if(!visited[i]){
                visited[i] = true;
                answer ++;
                dfs(i);
            }    
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
