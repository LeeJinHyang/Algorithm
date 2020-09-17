package 단지번호붙이기_2667;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Point{
		int x;
		int y;
		Point(){}
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {0,0,1,-1};
	static int[] dc = {1,-1,0,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		for(int i = 0; i< N; i++) {
			String str = sc.next();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		int[] sum = new int[25*25];
		int num = 0; 
		for(int i = 0; i< N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]&&map[i][j]==1) {
					visited[i][j] = true;
					sum[num] = BFS(new Point(i,j));
					
					num++;
					
				}
			
			}
		}
		int[] result = new int[num];
		for(int i = 0; i < num; i++) {
			result[i] = sum[i];
		}
		Arrays.sort(result);
		System.out.println(num);
		for(int i = 0; i < num; i++) {
			System.out.println(result[i]);
		}
		
	}
	public static int BFS(Point p) {
		int count = 0;
		Queue<Point> que = new LinkedList<>();
		que.add(p);
		count = 0;
		visited[p.x][p.y] = true;
		while(!que.isEmpty()) {
			Point next = que.poll();
			count ++;
			for(int i = 0; i <dr.length; i++) {
				int nr = next.x + dr[i];
				int nc = next.y + dc[i];
				if(nr>=0&&nr<map.length&&nc>=0&&nc < map.length&&!visited[nr][nc]&&map[nr][nc]==1) {
					visited[nr][nc] = true;
					
					que.add(new Point(nr,nc));
				}
			}
		}
		return count;
	}

}
