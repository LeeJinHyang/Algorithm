1. set 요소 빼오기

``` Iterator iter = set.iterator(); // set을 Iterator 안에 담기
		while(iter.hasNext()) { // iterator에 다음 값이 있다면
			// System.out.println("iterator : " + iter.next()); // iter에서 값 꺼내기
            answer[i] = (int)iter.next();
            i++;
		}
```

