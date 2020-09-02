package 일곱난장이_2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		boolean flag = false;
		for(int i = 0; i < 8; i++) {
			for(int j = i+1; j < 9; j++) {
				if(arr[i]+arr[j] == (sum - 100)) {
					arr[i] = 100;
					arr[j] = 100;
					flag = true;
				}
				if(flag) break;
			}
			if(flag) break;
		}
		Arrays.sort(arr);
		for(int i = 0; i < 7 ; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
}
