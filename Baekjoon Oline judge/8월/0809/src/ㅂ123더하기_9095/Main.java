package §≤123¥ı«œ±‚_9095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			int num = sc.nextInt();
			int count = 0;
			for (int i = num; i >= 0; i--) {
				for (int j = (num - i) / 2; j >= 0; j--) {
					for (int k = (num - i - 2 * j) / 3; k >= 0; k--) {
						if ((i + j * 2 + k * 3) == num) {
							count += fact(i + j + k) / (fact(i) * fact(j) * fact(k));
						}
					}
				}
			}
			System.out.println(count);
		}

	}

	static public long fact(int n) {
		long num = 1;
		if (n != 0) {
			for (int i = n; i > 0; i--) {
				num *= i;
			}
		}
		return num;
	}
}
