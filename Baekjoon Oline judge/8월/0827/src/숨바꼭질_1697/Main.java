package ¼û¹Ù²ÀÁú_1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Point {
		int x;
		int num;

		Point(int x, int num) {
			this.x = x;
			this.num = num;
		}
	}

	static int K;
	static int N;
	static int[] dr = { 1, -1, 2 };
	static int min;
	static boolean[] visited;
	static int max_value = 100000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		min = Integer.MAX_VALUE;
		visited = new boolean[max_value+1];
		if(N == K) min = 0;
		else {
		bfs(N);
		}
		System.out.println(min-1);
	}
		

	public static void bfs(int p) {
		Queue<Point> que = new LinkedList<>();
		que.add(new Point(p, 0));
		while (!que.isEmpty()) {
			Point next = que.poll();
			if (next.x == K) {
				min = Math.min(next.num, min);
				return;
			}

			for (int dir = 0; dir < dr.length; dir++) {
				if (dr[dir] == 2&&!visited[next.x *2]&&(next.x *2)< max_value) {
					que.add(new Point(2 * next.x, next.num + 1));
				} else if(!visited[next.x+dr[dir]]&&(next.x + dr[dir])< max_value){
					que.add(new Point(next.x + dr[dir], next.num + 1));
				}
			}
		}

	}

}
