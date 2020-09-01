import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스순열 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int K = 3;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < arr.length; i++)
			queue.add(arr[i]);
		while( !queue.isEmpty() ) {
			for(int i = 0; i < K-1; i++) {
				queue.add(queue.poll());
			}
			System.out.println(queue.poll());
		}
	}
}
