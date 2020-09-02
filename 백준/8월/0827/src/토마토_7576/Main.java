package ≈‰∏∂≈‰_7576;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Point{
		int x;
		int y;
		int num;
		Point(int x,int y,int num){
			this.x = x;
			this.y = y;
			this.num = num;
		}
	}
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {0,0,1,-1};
	static int[] dc = {1,-1,0,0};
	static Queue<Point> que;
	static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		boolean flag = true;
		que = new LinkedList();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j]==1) {
					que.add(new Point(i,j,0));
				} 
			}
		}
		
		bfs();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j]==0) {
					flag = false;
				} 
			}
		}
		if(flag)
			System.out.println(max);
		else System.out.println("-1");
		
		
		
		
	}
	
	public static void bfs() {
			while(!que.isEmpty()) {
				Point next = que.poll();
				map[next.x][next.y] = 1;
				max = Math.max(max, next.num);
				for(int dir = 0;dir < dr.length; dir++ ) {
					int nr = next.x + dr[dir];
					int nc = next.y + dc[dir];
					if(nr >=0 && nr < map.length&& nc >=0 &&nc < map[0].length&& !visited[nr][nc]&&map[nr][nc]==0) {
						visited[nr][nc] = true;
						que.add(new Point(nr,nc,next.num+1));
					}
						
				}
			}
			
	}

}
