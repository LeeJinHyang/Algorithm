package ABCDE;

import java.util.Scanner;

public class Main {
	static int[] parent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parent = new int[N];
		for(int i = 0 ; i < N; i++) {
			parent[i] = i;	
		}
		for(int i = 0 ; i < M; i++) {
			
		}
	}
	static void union(int x,int y) {
		parent[x] = y;
	}
	static int find(int x) {
		if(parent[x]==x) return x;
		else return find(parent[x]);
	}
}
