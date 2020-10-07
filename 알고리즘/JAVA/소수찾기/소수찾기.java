package 소수찾기;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int[] array = new int[N];
		for(int n = 0; n < N; n++) {
			array[n] = sc.nextInt();
			max =Math.max(max,array[n]);
		}
		boolean[] Prim = new boolean[max+1];
		for(int i =2; i <= Math.sqrt(max); i++) {
			if(!Prim[i]) {
			for(int j = 2; i*j <= max;j++) {
				Prim[i*j] = true;
			}
			}
		}
		int cnt = 0;
		for(int n = 0; n < N; n++) {
			if(array[n]==1) continue;
			if(!Prim[array[n]]) cnt++;
		}
		System.out.println(cnt);
		
	}

}
