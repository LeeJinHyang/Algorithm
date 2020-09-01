package 링크와스타트_15661;

import java.util.Scanner;

public class Main {
	static int[][] map;
	static boolean[] visited;
	static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
	}

}
