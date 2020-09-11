#### GCD 합 구하기  - 9613 : int 타입으로 가능한 숫자인지 long으로 선언해줘야하는 숫자인지 판단해야 한다.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num ; i++) {
            int num2 = sc.nextInt();
            int[] arr = new int[101];
            long sum = 0;

            for(int j = 0; j < num2; j++) {
                arr[j] = sc.nextInt();
            }
            for(int r = 0; r < num2; r++) {
                for(int c = r+1; c < num2;c++) {
                        sum += findGCD(arr[r],arr[c]);
                }
            }
            System.out.println(sum);
        }
    }
    static public int findGCD(int num1, int num2) {
        if(num1 % num2 ==0) return num2;
        else return findGCD(num2, num1%num2);
    }
 }
```



![img](https://t1.daumcdn.net/cfile/tistory/99CE12465C7C785607)

| 종류    | 설명           | 저장공간 | 값의 범위(최소값 ~ 최대값)                                   |
| ------- | -------------- | -------- | ------------------------------------------------------------ |
| boolean | 논리값         | 1 bit    | true / false                                                 |
| byte    | 부호 있는 정수 | 8 bits   | -128 ~ 127                                                   |
| char    | 유니코드 문자  | 16 bits  | \u0000 ~ \uFFFF                                              |
| short   | 부호 있는 정수 | 16 bits  | -32768 ~ 32767                                               |
| int     | 부호 있는 정수 | 32 bits  | -2147483648 ~ 2147483647                                     |
| long    | 부호 있는 정수 | 64 bits  | -9223372036854775808 ~ 9223372036854775807                   |
| float   | IEEE 754 실수  | 32 bits  | 1.40239846E-45f<br/> ~ (표현 가능 양수 범위)<br/> 3.40282347E+38f |
| double  | IEEE 754 실수  | 64 bits  | 4.94065645841246544E-324<br/> ~ (표현 가능 양수 범위)<br/>1.79769313486231570E+308 |

