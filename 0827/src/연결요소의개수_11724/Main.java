package 연결요소의개수_11724;

import java.awt.Label;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] map;
	static boolean[] visited;
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		count = 0;
		map = new int[N][N];
		visited = new boolean[N];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a-1][b-1] = 1;
			map[b-1][a-1] = 1;
		}
		
		for(int i = 0; i< N; i++) {
			if(!visited[i]) {
				BFS(i);
				count++;
			}
		}
		System.out.println(count);
		
	}
	static void BFS(int v) {
		Queue<Integer> que = new LinkedList<>();
		que.add(v);
		visited[v] = true;
		while(!que.isEmpty()) {
			int next = que.poll();
			for(int i = 0; i < map.length; i++) {
				if(!visited[i]&&map[i][next]==1) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
	}
	

}
