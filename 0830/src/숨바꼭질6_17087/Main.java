package ¼û¹Ù²ÀÁú6_17087;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] map = new int[N];
		for(int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			map[i] = Math.abs(tmp - S);
		}
		int tmp  = map[0];
		for(int i = 1; i < N; i++) {
			tmp = gcd(tmp,map[i]);
		}
		System.out.println(tmp);
	}
	static public int gcd(int x, int y) {
		if( y == 0 )return x;
		else return gcd(y,x%y);
	}

}
