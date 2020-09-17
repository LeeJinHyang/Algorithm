package 미로탐색_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Point{
		int x;
		int y;
		int count;
		Point(){}
		Point(int x, int y,int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	static int[][] map;
	static boolean[][] visited;
	static int min;
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		visited[0][0] = true;
		//DFS(0,0,1); //시간초과 문제로 bfs사용
		bfs(new Point(0,0,0));
		System.out.println(min);
	}
	static void DFS(int x, int y,int count) {
		if(count > min) return;
		if(x == (map.length-1)&& y == (map[0].length-1)) {
			min = Math.min(count, min);
			return;
		}
		for(int dir = 0; dir < dr.length; dir++) {
			int nr = x + dr[dir];
			int nc = y + dc[dir];
			if(nr >= 0 && nr < map.length && nc >=0 &&nc < map[0].length&& !visited[nr][nc]&&map[nr][nc] ==1) {
				visited[nr][nc] = true;
				DFS(nr,nc, count+1);
				visited[nr][nc] = false;
			}
		}
		
	}
	
	static void bfs(Point p) {
		Queue<Point> que = new LinkedList();
		que.add(p);
		while(!que.isEmpty()) {
			Point next = que.poll();
			for(int dir = 0; dir < dr.length; dir++) {
				int nr = next.x + dr[dir];
				int nc = next.y + dc[dir];
				if(nr == (map.length-1) && nc == (map[0].length)) {
					min = Math.min(min, next.count+1);
				}
				if(nr >= 0 && nr < map.length && nc >=0 &&nc < map[0].length&& !visited[nr][nc]&&map[nr][nc] ==1) {
					visited[nr][nc] = true;
					que.add(new Point(nr,nc,next.count+1));
				}
			}
		}
 	}

}
