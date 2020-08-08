package 소수찾기_1987;

import java.util.Scanner;

public class Main {
	static boolean[] Prime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Prime = new boolean[1001];
		Prime[1] = true;
		Prime[0] = true;
		
		for(int i = 2; i < Math.sqrt(1001); i++) {
			for(int j = 2; i * j < 1001; j++) {
				Prime[i*j] = true;
			}
		}
		int count = 0;
		for(int i =0; i < N; i++) {
			int n = sc.nextInt();
			if(!Prime[n]) count++;
		}
		System.out.println(count);
	}
	

}
