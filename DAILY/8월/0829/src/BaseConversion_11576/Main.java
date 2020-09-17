package BaseConversion_11576;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int m = sc.nextInt();
		String[] arr = new String[m];
		for(int i = 0; i <m; i++) {
			arr[i] = sc.next();
		}
		int dec = 0;
		for(int i = 0; i < m;i++) {
			dec += Integer.parseInt(arr[i]) * Math.pow(A, (m-i-1));
			
		}
		
			StringBuilder std = new StringBuilder();
		while(true) {
			if(dec == 0) {
				std.append("\n");
				break;
				}
			std.insert(0,Integer.toString(dec%B)+" ");
			dec = dec/B;
		
		
	}
		System.out.println(std.toString());
	}
}
