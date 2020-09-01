
public class 출력최적화 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000000; i++) {
//			System.out.print("*");
			sb.append("*");
		}
		System.out.println(sb);
	}
}
