# StringTokenizer, StringBuffer, StringBuilder클래스



## StringTokenizer 

문자열이 특정 구분자로 연결되어 있을 때, 구분자를 기준으로 하여 문자열을 분리하기 위해서 split() 메소드 또는 StringTokenizer 클래스를 이용할 수 있다.



```java
public class StringSplitExam {
 
    public static void main(String[] args) {
        String text = "Jack&Nick,Ciel-Tom,Jolie";
        
        String[] names = text.split("&|,|-");
        
        for (String name : names) {
            System.out.println(name);
        }
    }
 
}
```



문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer 클래스를 사용하면 손 쉽게 문자열을 분리해 낼 수 있다. StringTokenizer 객체를 생성할 때, 첫번째 파라미터로 전체 문자열을 주고, 두 번째 파라미터로 구분자를 주면 된다. 만약 구분자가 생각되면 구분자는 기본적으로 공백이 된다

```java
StringTokenizer st = new StringTokenizer("문자열", "구분자");
```

| method  |                 | 설명                           |
| ------- | --------------- | ------------------------------ |
| int     | countTokes()    | 꺼내지 않고 남아있는 토큰의 수 |
| boolean | hasMoreTokens() | 남아있는 토근이 있는지 여부    |
| String  | nextToken()     | 토큰을 하나씩 꺼내옴           |

```java
import java.util.StringTokenizer;
 
public class StringTokenizerExam {
 
    public static void main(String[] args) {
        String text = "Jack/Jolie/Chan";
        
        // Way 1
        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        
        for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }
        
        System.out.println();
        
        // Way 2
        st = new StringTokenizer(text, "/");
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
 
}
```





## StringBuffer, StringBuilder 클래스

String 클래스는 replace 등을 이용하여 수정 할 때, 수정되는 것이 아니라 수정된 문자열을 새롭게 만들어 가르킨다.

그러므로, 수정 등을 자주 사용하게 된다면 메모리 부하가 걸리게 될 것이다.



반면, StringBuffer 와 StringBuilder는 내부 버퍼가 있어서, 문자열을 수정할 때, 버퍼 안에 있는 문자열이 직접적으로 수정된다.

두 클래스의 차이는 StringBuffer는 멀티스레드에서 사용 할 수 있도록 동기화가 적용 됐지만 Builder는 단일 스레드 환경에서만 사용되게 동기화가 적용되지 않았다.



```java
StringBuilder sb = new StringBuilder(초기크기);
```



| method                                  | 설명                                              |
| --------------------------------------- | ------------------------------------------------- |
| append(...)                             | 문자열 끝에 주어진 파라미터 추가                  |
| Insert(int offset, ...)                 | 문자열 중간에 주어진 파라미터 추가                |
| delete(int start, int end)              | 문자열의 일부분을 삭제                            |
| deleteCharAt(int index)                 | 문자열에서 주어진 index의 문자를 삭제             |
| replace(int start, int end, String str) | 문자열의 일부분을 다른 문자열로 바꿈              |
| StringBuilder reverse()                 | 문자열의 순서를 바꿈                              |
| setCharAt(int index, char ch)           | 문자열에서 주어진 index의 문자를 다른 문자로 대치 |





```java
public class StringBuilderExam {
 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Java ");
        sb.append("Project Meeting");
        System.out.println(sb.toString());
        
        sb.insert(4, "8");
        System.out.println(sb.toString());
 
        sb.setCharAt(4, '9');
        System.out.println(sb.toString());
        
        sb.replace(14, 21, "Design");
        System.out.println(sb.toString());
        
        sb.delete(4, 5);
        System.out.println(sb.toString());
        
        int length = sb.length();
        System.out.println("총 문자수 : " + length);
    }
 
}
 
```

