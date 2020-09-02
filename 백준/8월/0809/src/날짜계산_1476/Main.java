package 날짜계산_1476;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int y  = 1;  
		while(true) {
			if((y-E)%15==0 &&(y-S)%28==0 &&(y-M)%19==0) break;
			else y++;
		}
		System.out.println(y);
	}
}
