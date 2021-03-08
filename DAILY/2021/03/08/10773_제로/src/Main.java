import java.util.Scanner;

class Main{
public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int top = 0;
        int[] array = new int[N+1];
        for(int i = 0; i < N; i++){
                int num = sc.nextInt();
                if(num == 0 ){
                        array[top] = 0;
                        top--;
                }
                else{
                        array[top] = num;
                        top++; 
                }
        }
        int result = 0;
for(int i = 0; i < top; i++){
        result+= array[i];
}

        System.out.println(result);
        }

}