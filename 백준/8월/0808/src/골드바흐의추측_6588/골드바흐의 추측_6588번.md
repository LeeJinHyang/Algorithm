### 골드바흐의 추측_6588번

## 문제

1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.

> 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.

예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.

이 추측은 아직도 해결되지 않은 문제이다.

백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.

1. 소수인지 판단할 수 있는 boolean 형식의 Prime 배열을 만든다
2. 입력 받은 수를 홀수 Prime 을 돌려서 앞에서 부터 돌린다 (n - a)가 홀수prime number가 될때까지 반복
3. 만일 n/2 까지 과정을 반복해서 답을 얻을 수 없을 경우 "Goldbach's conjecture is wrong." 출력

```java
package 골드바흐의추측_6588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //prime 베열을 먼저 만든다
        boolean[] prime = new boolean[1000001];
        prime[1] = true;
        for(int i = 2; i < Math.sqrt(1000001); i++) {
            if(prime[i]) continue;
            for(int j = 2; j * i < 1000001; j++) {
                prime[i * j] = true;
            }
        }
        while(true) {
            int num = sc.nextInt();
            if(num==0) break;
            boolean flag = false;
            int b = 0;
            int a = 0; 
            for(int i = 3; i < num; i=i+2) {
                int j = num - i;
                if(flag) break;
                if(!prime[i]&&!prime[j]&&j%2==1&&j > 0) {
                    flag = true;
                    a = i;
                    b = j;
                }
            }
            if(flag)
                System.out.println(num +" = "+ a+" + "+b);
            else System.out.println("Goldbach's conjecture is wrong.");
        }
    }
 }
```

![image-20200808144811454](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200808144811454.png)

prime[a] 의 값이 소수인지 판별하는 부분을 빼먹어서 오답이 났었다

