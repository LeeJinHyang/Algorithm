package 하나로_1251;

import java.util.Scanner;

public class Solution {
//크루스칼 알고리즘을 활용하는 문제
	static long[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] tmp_map = new int[N][2];
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < N; j++) {
					tmp_map[j][i] = sc.nextInt();
				}
			}
			double E = sc.nextDouble();
			//각각 간선의 길이를 구하는 부분
			map = new long[N][N];
			for(int i = 0; i < N; i++) {
				int x1 = tmp_map[i][0];
				int y1 = tmp_map[i][1];
				for(int j = i+1; j < N; j++) {
					int x2 = tmp_map[j][0];
					int y2 = tmp_map[j][1];
					long result = (long)((Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
					map[i][j] = result;
					map[j][i] = result;
				}
			}
			
			
		}
	}
	
	static void Di(int i, iny ) {
		
	}

}
