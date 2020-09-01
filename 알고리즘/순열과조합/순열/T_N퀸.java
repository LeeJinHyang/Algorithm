import java.util.Arrays;

public class N퀸 {
	static int[][] map;
	public static void main(String[] args) {
		map = new int[8][8];
		backtrack(0);
		System.out.println(cnt);
	}
	static int cnt = 0;
	//idx번째 행에 퀸을 배치하는 함수
	static void backtrack(int idx) {
		//퀸 다고름
		if( idx == map.length ) {
			cnt++;
			for(int i = 0; i < map.length; i++)
				System.out.println(Arrays.toString(map[i]));
			System.out.println();
			return;
		}
		
		//열의 갯수만큼 반복하면서( 퀸을 놓을 수 있는 후보지를 검사 )
		for(int i = 0; i < map[idx].length; i++) {
			if( isPossible(idx, i) ) {
				map[idx][i] = 1;
				backtrack(idx + 1);
				map[idx][i] = 0;
			}
		}
	}
	static boolean isPossible(int r, int c) {
		//현재 map의 상태를 봤을때 r,c에 새로운 퀸을 놓아도 문제 없는지?
		
		//내 위로 퀸이 있는지 검사, 있으면 return false;
		for(int i = r; i >= 0; i--) {
			if( map[i][c] == 1 )
				return false;
		}
		//내 왼쪽 위로 퀸이 있는지 검사.
		for(int i = r, j = c; i >= 0 && j >=0; i--,j--) {
			if( map[i][j] == 1 )
				return false;
		}
		//내 오른쪾 위로 퀸이 있는지 검사.
		for(int i = r, j = c; i >= 0 && j < map[i].length; i--, j++) {
			if( map[i][j] == 1 )
				return false;
		}
		return true;
	}
}










