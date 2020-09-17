# StringBuilder - insert와 append



```java
class testStringBuilder{

  public static void main(String args[]){

    StringBuilder sb = new StringBuilder();
 
    sb.append("Hello .Welcome to Java.");
    sb.insert(6, "Jon");

    System.out.println(new String(sb));
  }
}
```



#### append

stringbuilder의 append함수는 문장의 맨 뒤에 추가하는 함수



#### insert

자신이 원하는 위치에 문장을 추가하는 함수

```java
public StringBuilder insert(int offset, String str)
```

Offset : 자신이 넣기 원하는 위치, 맨 앞에 넣고 싶으면 0으로 처리하면 된다