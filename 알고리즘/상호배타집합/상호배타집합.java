package 상호배타집합;

import java.util.Arrays;
import java.util.Scanner;

public class 상호배타집합 {
	static int[] parents;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parents = new int[N+1];
		for(int i = 1; i <= N; i++) {
			parents[i] = i;
		}
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			union(a,b);
		}
		System.out.println(Arrays.toString(parents));
		
	}
	
	static int find(int x) {
		if(x == parents[x]) return x;
		else return find(parents[x]);
	}
	static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		parents[px] = py;
	}
}
