package 순열;

import java.util.Arrays;

public class N퀸 {
	static int[][] map;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new int[8][8];
		backtrack(0);
		System.out.println(cnt);
	}
	static int cnt = 0;
	
	static void backtrack(int idx) {
		if(idx == map.length) {
			cnt++;
			for(int i = 0; i < map.length; i++) 
				System.out.println(Arrays.toString(map[i]));
			System.out.println();
			return;
			}
			for(int i =0; i < map[idx].length; i++) {
				if(isPossible(idx,i)) {
					map[idx][i] = 1;
					backtrack(idx+1);
					map[idx][i] = 0;
				}
			}
		}
	static boolean isPossible(int r, int c) {
		//내 위로 퀸이 있는지 검사
		for(int i = r; i >= 0; i--) {
			if(map[i][c] == 1) return false;
		}
		//내 왼쪽 위로 퀸이 있는지 검사
		for(int i = r, j = c; i >= 0 && j >= 0 ; i--,j--) {
			if(map[i][j]==1)  return false;
		}
		//내 오른쪽 위로 퀸이 있는지 검사
		for(int i = r, j = c; i >= 0 && j < map[i].length; i--, j++) {
			if(map[i][j] == 1) return false;
		}
		return true;
	}
	}
	


