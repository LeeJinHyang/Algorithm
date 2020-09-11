package 소수구하기_1929;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean[] prime = new boolean[1000001];
		prime[1] = true;
		for(int i = 2; i <= Math.sqrt(1000000); i++) {
			for(int j = 2; j * i <1000001; j++) {
				prime[i*j] = true;
			}
		}
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = M; i <= N; i++) {
			if(!prime[i]) {
			System.out.println(i);
		}
		}
	}

}
