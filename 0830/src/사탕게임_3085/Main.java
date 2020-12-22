package 사탕게임_3085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] map = new char[N][N];
		
		//입력받는 부분  빨 : C /파 : P // 초 : Z // 노 :Y
		for(int i = 0;i < N; i++) {
			String tmp = sc.next();
			for(int j = 0; j < N; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}
		
		
	}

}
