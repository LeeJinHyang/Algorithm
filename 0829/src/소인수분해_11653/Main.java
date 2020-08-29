package 소인수분해_11653;

import java.util.Scanner;

public class Main {
	static int MAX = 10000001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		
		boolean[] prime = new boolean[MAX];
		prime[1] = true;
		for(int i = 2; i < Math.sqrt(MAX); i++) {
			for(int j = 2; j * i < MAX; j++) {
				prime[i*j] = true;
			}
		}
		while(true) {
			if(N == 1) break;
		for(int i =2; i < MAX; i++) {
			if(!prime[i]&&N % i == 0) {
				System.out.println(i);
				N = N/i;
				break;
			}
		}
		}
	}

}
