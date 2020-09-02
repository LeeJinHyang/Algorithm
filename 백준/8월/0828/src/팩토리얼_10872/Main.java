package ÆÑÅä¸®¾ó_10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long num = 1;
		for(int i = 1; i <= N; i++) {
			num *= i;
		}
		System.out.println(num);
	}

}
