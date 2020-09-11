package 외판원순회2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static int[] result;
	static int[][] map;
	static int N;
	static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N];
		result = new int[N+1];
		min = Integer.MAX_VALUE;
		for(int r = 0; r <N; r++) {
			for(int c = 0; c < N; c++) {
				map[r][c] = sc.nextInt();
			}
		}
		perm(0);
		System.out.println(min);
		
		
	}
	
	static void perm(int idx) {
		if(idx == result.length-1) {
			int sum = 0;
			boolean flag = false;
			result[result.length-1] = result[0];
			for(int i =0; i <result.length-1;i++ ) {
				int num = map[result[i]][result[i+1]];
				if(num == 0) { 
					flag = true;
					break;
					}
				else sum += num;
			}
			if(flag) sum = Integer.MAX_VALUE;
			min = Math.min(min, sum);
			return;
		}
		for(int i =0;i <N;i++ ) {
			if(!visited[i]) {
				result[idx] = i;
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
		
	}

}
