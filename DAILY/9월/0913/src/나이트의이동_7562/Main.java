package 나이트의이동_7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] rd = {-2,-1,1,2,2,1,-1,-2};
	static int[] cd = {1,2,2,1,-1,-2,-2,-1};
	static int[][] map;
	static boolean[][] visited;
	static int ans;
	static class Point{
		int x;
		int y;
		int count;
		Point(int x,int y,int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int I = sc.nextInt();
			map = new int[I][I];
			visited = new boolean[I][I];
			int from_x = sc.nextInt();
			int from_y = sc.nextInt();
			int to_x = sc.nextInt();
			int to_y = sc.nextInt();
			ans = -1;
			map[to_x][to_y] = 2;
			BFS(from_x, from_y);
			System.out.println(ans);
		}
	}
	static void BFS(int x,int y) {
		Queue<Point> que = new LinkedList<>();
		que.add(new Point(x,y,0));
		visited[x][y] = true;
		while(!que.isEmpty()) {
			Point front = que.poll();
			if(map[front.x][front.y] == 2) {
				ans = front.count;
				return;
			}
			for(int dir = 0; dir < rd.length; dir++) {
				int nr = front.x + rd[dir];
				int nc = front.y + cd[dir];
				if(nr >= 0 && nr < map.length &&nc>=0&&nc < map[0].length&&!visited[nr][nc]) {
					
					visited[nr][nc] = true;
					que.add(new Point(nr,nc,front.count+1));
				}
			}
		}
	}

}
