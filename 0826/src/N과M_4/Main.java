package N��M_4;

import java.util.Scanner;

public class Main {
	static int[] result;
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		
		result = new int[M];
		Perm(0,1);
	}
	static void Perm(int idx,int num) {
		if(idx == result.length) {
			for(int i : result) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i = num; i <= N; i++) {
			result[idx] = i;
			Perm(idx+1,i);
		}
	}

}
