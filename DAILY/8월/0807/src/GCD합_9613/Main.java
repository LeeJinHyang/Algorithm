package GCDÇÕ_9613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num ; i++) {
			int num2 = sc.nextInt();
			int[] arr = new int[101];
			long sum = 0;
			
			for(int j = 0; j < num2; j++) {
				arr[j] = sc.nextInt();
			}
			for(int r = 0; r < num2; r++) {
				for(int c = r+1; c < num2;c++) {
						sum += findGCD(arr[r],arr[c]);
				}
			}
			System.out.println(sum);
		}
	}
	static public int findGCD(int num1, int num2) {
		if(num1 % num2 ==0) return num2;
		else return findGCD(num2, num1%num2);
	}

}
