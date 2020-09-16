# Map

![img](https://t1.daumcdn.net/cfile/tistory/255AB64857BD476223)



HashMap : 저장은 느리지만 많은 양의 데이터를 검색하는데 뛰어난 성능을 보인다.

TreeMap : HashMap에 비해 저장이 빠르지만 데이터를 가져올 때 약간 느리다.



### Map

- key : 중복 불가능
- value : 중복 가능

데이터와 중복된 키와 값을 저장하면, 기존의 값은 없어지고 마지막에 저장된 값이 남게된다.



#### Method

- **void clear()** : map의 모든 객체를 삭제

- **boolean containsKey(Object key)**  :  지정된 key 객체와 일치하는 map의 key 객체가 있는지 확인

- **boolean containsValue(Object value)** : 지정된 value 객체와 일치하는 map의 value객체가 있는지 확인

- **Set entrySet()** : map에 저장되어 있는 key-value 쌍을 Map.Entry 타입의 객체로 저장한 "Set"으로 반환

- **boolean equals(Object o)** : 동일한 map인지 비교

- **Object get(Object key)** : 지정한 key객체에 대응하는 value 객체를 찾아서 반환

- **int hashCode()** : 해시코드를 반환

- **boolean isEmpty()** : Map이 비어있는지 확인

- **Set keySet()** : Map에 저장된 모든 key객체를 반환한다

- **Object put(Object key, Object value)** : Map에 value 객체를 key객체에 연결(mapping)하여 저장

- **void putAll(Map t)** : 지정된 Map으 모든 key-value쌍을 추가

- **Object remove(Object key)** : 지정한 key 객체와 일치하는 key-value 객체를 삭제

- **int size()** : Map에 저장된 key-value 쌍의 개수를 반환

- **Collection values()** : Map에 저장된 모든 value 객체를 반환

- **Object clone()** : 현재 HashMap을 반환한다

- **getOrDefault(key, defaultValue)** : map에서 찾는 Key가 없다면 defaultValue를 리턴함

  



### map.Entry 인터페이스

map인터페이스의 "내부 인터페이스"

map에 저장되는 key와 value를 다루기 위한 인터페이스

따라서 map인터페이스를 구현하는 클래스는 Map.Entry 인터페이스도 함께 구현해야 한다.

#### 

#### Method

- **boolean equals(Object o)** : 동일한 Entry인지 비교
- **Object getKey()** : Entry의 key 객체를 반환
- **Object getValue()** : Entry의 value 객체를 반환
- **int hashCode()** : Entry의 해시코드를 반환
- **Object setValue(Object value)** : Entry의 value 객체를 지정된 객체로 바꾼다







### 1. HashMap

- 해시맵을 사용하면 데이터 저장은 느리지만 많은 양의 데이터를 검색하는데 있어서 뛰어나다
- HashMap은 Map을 구현했으므로 key값과 value값을 묶어서 하나의 entry로 저장한다
- key와 value값에 null을 허용한다

HashMap<String, Integer> map = enw HashMap();

 