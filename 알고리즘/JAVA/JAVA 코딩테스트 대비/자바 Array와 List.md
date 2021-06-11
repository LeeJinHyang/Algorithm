**배열을 List로**

1. **Arrays.asList()**
2. **new ArrayList<>(Arrays.asList())**
3. **Collectors.toList()**

 

**ArrayList를 배열로**

1. **toArray() - java.util.List**





```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class IntArrayConvertToList {
    public static void main(String[] args) {
        // int 배열
        int[] arr = { 1, 2, 3 };
        // int -> List
        List<Integer> intList
        = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.toList());
        // List 출력
        System.out.println(intList.size()); // 3
        System.out.println(intList); // [1, 2, 3]
    }
}

출처: https://hianna.tistory.com/552 [어제 오늘 내일]
```





### 자바 배열 쪼개기

```
int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
```

