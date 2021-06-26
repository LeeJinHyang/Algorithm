import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] num = new int[n+1];
        num[1] = 0;
        for(int i = 2; i < n+1; i++){
            int min = num[i-1];
            if(i%2 == 0 ) {
                min = Math.min(min, num[i/2]);
            }
            if(i%3 == 0){
                min = Math.min(min, num[i/3]);
            }
            num[i] = min + 1;

        }

        System.out.println(num[n]);

    }
}
