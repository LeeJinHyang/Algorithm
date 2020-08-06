import java.util.Scanner;

public class 나머지_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.  (A+B)%C
		//2. ((A%C) + (B%C))%C = (A+B)%C%C = 1번 %C
		//3.  (A×B)%C
		//4. ((A%C) × (B%C))%C = (A x B) %C %C = 3번 %C
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i =0; i < 3; i++) arr[i] = sc.nextInt();
		int num1 = (arr[0]+arr[1])%arr[2];
		int num3 = arr[0]* arr[1]%arr[2];
		System.out.println(num1);
		System.out.println(num1%arr[2]);
		System.out.println(num3);
		System.out.println(num3%arr[2]);
	}

}
