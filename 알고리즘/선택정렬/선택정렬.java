import java.util.Arrays;

public class 선택정렬 {
	public static void main(String[] args) {
		int[] arr = {5,8,1,4,7,3,2,9,6};
		
		for(int j = 0; j < arr.length; j++)
		{
			int min = arr[j];
			int minIdx = j;
			for(int i = j; i < arr.length; i++) {
				if( min > arr[i] ) {
					min = arr[i];
					minIdx = i;
				}
			}
			int tmp = arr[j];
			arr[j] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
