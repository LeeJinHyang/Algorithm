package DFS¿ÍBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N];
		for(int i = 0; i < M; i++) {
			int a  = sc.nextInt();
			int b = sc.nextInt();
			map[a-1][b-1] = 1;
			map[b-1][a-1] = 1;
			
		}
		visited[V-1] = true;
		DFS(V-1);
		visited = new boolean[N];
System.out.println();
		visited[V-1] = true;
		BFS(V-1);
		System.out.println();
	}
	static void DFS(int v) {
		System.out.print((v+1)+" ");
		for(int i = 0; i < map.length; i++) {
			if(!visited[i]&&map[v][i]==1) {
				visited[i] = true;
				DFS(i);
			} 
		}
	}
	static void BFS(int v) {
		Queue<Integer> que = new LinkedList<>();
		visited[v] = true;
		que.add(v);
		while(!que.isEmpty()) {
		int next = que.poll();
		System.out.print((next+1)+" ");
			for(int i = 0; i < map.length; i++) {
			if(!visited[i]&&map[next][i]==1) {
				visited[i] = true;
				que.add(i);

			}
		}
		}
	}

}
