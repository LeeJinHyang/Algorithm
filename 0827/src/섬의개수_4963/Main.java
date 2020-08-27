package ¼¶ÀÇ°³¼ö_4963;

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
	static boolean[][] visited;
	static int[][] map;
	static int[] dr = {0,0,1,-1,1,1,-1,-1};
	static int[] dc = {1,-1,0,0,1,-1,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((w==0&&h==0)) break;
			map = new int[w][h];
			visited = new boolean[w][h];
			for(int i = 0; i < w; i++) {
				for(int j = 0; j < h; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int count =0;
			
			for(int i = 0; i < w; i++) {
				for(int j = 0; j < h; j++) {
					if(!visited[i][j]&&map[i][j]==1) {
						//System.out.println("i : "+i+" j : "+j);
						BFS(new Point(i,j));
						count ++;
					}
				
				}
			}
			
		System.out.println(count);
		}
		
		
	}
	static void BFS(Point p) {
		Queue<Point> que = new LinkedList();
		que.add(p);
		visited[p.x][p.y] = true;
		while(!que.isEmpty()) {
			Point next = que.poll();
			for(int dir = 0; dir < dr.length; dir++) {
				int nr = next.x + dr[dir];
				int nc = next.y + dc[dir];
				if(nr >= 0 &&nr < map.length&& nc >=0 &&nc <map[0].length&&!visited[nr][nc]&&map[nr][nc] ==1) {
					que.add(new Point(nr,nc));
					visited[nr][nc] = true;
				}
			}
		}
	}

}
