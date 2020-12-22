package 이분그래프_1707;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Point {
		int idx;
		int color;

		Point() {
		}

		Point(int idx, int color) {
			this.idx = idx;
			this.color = color;
		}
	}

	static int[][] map;
	static boolean[] visited;
	static int count;
	static int[] color;
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			map = new int[N][N];
			color = new int[N];
			visited = new boolean[N];
			flag = false;
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a - 1][b - 1] = 1;
				map[b - 1][a - 1] = 1;
			}

			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					BFS(i);
				}
			}
			System.out.println("start");
			visited = new boolean[N];
			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					check_BFS(i);
				}
			}
			
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	static void BFS(int v) {
		Queue<Point> que = new LinkedList<>();
		que.add(new Point(v, 1));
		color[v] = 1;
		visited[v] = true;
		while (!que.isEmpty()) {
			Point next = que.poll();
			for (int i = 0; i < map.length; i++) {
				if (!visited[i] && map[i][next.idx] == 1) {
					if (color[i] == 0 && next.color == 1) {
						que.add(new Point(i, 2));
						color[i] = 2;
					} else if(color[i] == 0 && next.color == 2){
						que.add(new Point(i, 1));
						color[i] = 1;
					}
					visited[i] = true;
				}
			}
		}
	}
	
	static void check_BFS(int v) {
		Queue<Integer> que = new LinkedList<>();
		que.add(v);
		color[v] = 1;
		visited[v] = true;
		while (!que.isEmpty()) {
			if(flag) break;
			int next = que.poll();
			for (int i = 0; i < map.length; i++) {
				if(!visited[i]&&map[i][next]==1) {
				if(color[next] == color[i]) { 
					flag = true;
					break;
					}
				else {
					que.add(next);
					
				}
				}
				
			}
		}
	}

}
