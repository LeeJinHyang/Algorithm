package 다음순열_10972;


import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		int idx = 0;

		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				if (arr[n - j] > arr[n - j - 1]) {
					idx = n-j;
					swap(arr, n - j, n - j - 1);
					flag = true;
				}
				if (flag)
					break;
			}
			if (flag)
				break;
		}
		if (flag) {
			sort(arr, idx);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("-1");
		}
	}

	static public void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	static public void sort(int[] arr, int idx) {
		int[] array = new int[arr.length-idx];
		for(int i = idx; i < arr.length; i++) {
			array[i - idx] = arr[i];
		}
		Arrays.sort(array);
		for(int i = idx; i < arr.length; i++) {
			 arr[i] = array[i - idx];
		}
	}

}
