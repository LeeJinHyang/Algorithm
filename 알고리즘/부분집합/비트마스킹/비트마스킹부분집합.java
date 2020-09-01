
public class 비트마스킹부분집합 {
	public static void main(String[] args) {
		int[] arr = {1,-1,3};
		int[] arr2 = {2,0,7};
		
		int max = 0;
		//i를 부분집합의 경우의수인 8가지 만큼 돌게 만들고, 각 숫자를 부분집합의 상태에 매칭 예를들면 1은 {A}, 3은 {A,B}
		for(int i = 0; i < (1 << arr.length); i++) {
			int sum = 0;
			int sum2 = 0;
			//현 상태에서 각 원소들이 포함되는지 검사
			for(int j = 0; j < arr.length; j++) {
				if( ( i & ( 1 << j ) ) != 0 ) {
					sum += arr[j];
					sum2 += arr2[j];
				}
			}
			if( sum2 <= 5  )
				max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
