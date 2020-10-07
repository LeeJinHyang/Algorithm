import java.util.Arrays;

public class Perm {
	static int[] arr = {1,2,3};
	public static void main(String[] args) {
		perm(0);
	}
	static void perm(int idx) {
		if( idx == 3)
		{
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i = idx; i < 3; i++) {
			swap(i, idx);
			perm(idx+1);
			swap(i, idx);
		}
	}
	static void swap(int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b]	 = tmp;
	}
}
