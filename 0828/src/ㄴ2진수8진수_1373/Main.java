package ㄴ2진수8진수_1373;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String binary = sc.next();
		int bin = Integer.parseInt(binary,2);
		System.out.println(Integer.toOctalString(bin));
	}
	
}
