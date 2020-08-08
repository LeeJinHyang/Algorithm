package 골드바흐의추측_6588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//prime 베열을 먼저 만든다
		boolean[] prime = new boolean[1000001];
		prime[1] = true;
		for(int i = 2; i < Math.sqrt(1000001); i++) {
			if(prime[i]) continue;
			for(int j = 2; j * i < 1000001; j++) {
				prime[i * j] = true;
			}
		}
		while(true) {
			int num = sc.nextInt();
			if(num==0) break;
			boolean flag = false;
			int b = 0;
			int a = 0; 
			for(int i = 3; i < num; i=i+2) {
				int j = num - i;
				if(flag) break;
				if(!prime[i]&&!prime[j]&&j%2==1&&j > 0) {
					flag = true;
					a = i;
					b = j;
				}
			}
			if(flag)
				System.out.println(num +" = "+ a+" + "+b);
			else System.out.println("Goldbach's conjecture is wrong.");
		}
	}

}
