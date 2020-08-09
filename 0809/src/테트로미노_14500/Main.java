package 테트로미노_14500;

import java.util.Scanner;

public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int max;
	static int N;
	static int M;
	static int[] rd = {0,1,0,-1};
	static int[] cd = {-1,0,1,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[501][501];
		visited = new boolean[501][501];
		max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
//		visited[0][1] = true;
//		dfs(0,1,map[0][1],1);
		for(int i = 0; i < N; i++) {
			for(int j =0; j < M; j++) {
				visited[i][j] = true;
				dfs(i,j,map[i][j],1);
				visited[i][j] = false;
				checkShape(i,j);
				
			}
		}
//		
		System.out.println(max);
		
	}
	static public void dfs(int r,int c,int sum, int count) {
		if(count == 4) { 
			max = Math.max(max, sum);
			return;
		}
		for(int dir = 0; dir < rd.length; dir++) {
			int nr = r + rd[dir];
			int nc = c + cd[dir];
			if(nr >=0 && nr < N&& nc >=0 &&nc < M && !visited[nr][nc]) {
				visited[nr][nc] = true;
				dfs(nr,nc,map[nr][nc]+sum,count +1);
				visited[nr][nc] = false;
			}
			
		}
			
	}
	static public void checkShape(int r,int c) {
		
		//ㅏ
		if(c+2< M && r+1 <N) {
			max = Math.max(max, map[r][c]+map[r][c+1]+map[r][c+2]+map[r+1][c+1]);
		}
		//ㅓ
		if(c+2< M && r-1 >=0) {
			max = Math.max(max, map[r][c]+map[r][c+1]+map[r][c+2]+map[r-1][c+1]);
		}
		
		//ㅗ
		if(c-1>=0 && r+2 <N) {
			max = Math.max(max, map[r][c]+map[r+1][c]+map[r+2][c]+map[r+1][c-1]);
		}
		//ㅜ
		if(c+1<M && r+2 <N) {
			max = Math.max(max, map[r][c]+map[r+1][c]+map[r+2][c]+map[r+1][c+1]);
		}
		
		
	}
	

}
