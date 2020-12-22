package 연산자끼워넣기2_15658;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] op = new int[4];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			op[i] = sc.nextInt();
			for(int j= 0; j < i; j++) {}
		}
		
		
	}

}
