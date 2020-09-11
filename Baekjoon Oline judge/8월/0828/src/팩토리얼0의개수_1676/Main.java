package 팩토리얼0의개수_1676;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt2 = 0;
		int cnt5 = 0;
	
		for(int i =2 ; i <= N; i *= 2) cnt2 += N/i;
		for(int i =5 ; i <= N; i *= 5) cnt5 += N/i;
		
		System.out.println(Math.min(cnt2, cnt5));
	}
}
