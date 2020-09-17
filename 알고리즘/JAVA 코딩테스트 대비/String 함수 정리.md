# String 함수 정리

ㅇ

- charAt(int index) : String에서 해당 index의 char를 반환(char형)

- Substring(int start, int end) : start index부터 end index 까지 부분 문자열 생성(end index 바로 직전까지의 문자열만 반환한다)

- equals(String str2) : 단순히 같은지 틀린지 비교

- compareTo(String str2) : 사전순으로 어떤게 앞서는지 비교가 가능하다

  < 0  : st1이 사전순으로 앞선다

  = 0 : 같은 문자열

  [> 0] : str2가 사전순으로 앞선다

- compareToIgnoreCase(str2) : 대소문자 구별 없이 비교

- equalsToIgnoreCase(str2) : 대소문자 구별 없이 비교

- indexOf() :  해당 문자 또는 문자열의 인덱스를 반환한다

  - indexOf(char ch) : 해당 문자가 처음으로 나온 인덱스 반환
  - indexOf(char ch, int fromIndex) : 만약 ch 문자열이 여러개 나온다면 그 중 fromIndex번째 문자열의 인덱스를 반환해준다
  - indexOf(String str) : str이 처음 나오는 인덱스를 반환해준다
  - LastIndexOf(char ch) : 마지막부터 탐색를 수행한다.

- isEmpty() : 빈 문자열인지 체크

- Length() : 문자열의 길이(배열의 길이는 length, 리스트의 길이는 size)

- replace(char old, char new) : old 문자를 new 문자로 변환해준다

- Split(String str) : str문자열을 기준으로 문자열을 분리

- toCharArray() : char 배열로 변환

- toUpperCase() : 모두 대문자로

- toLowerCase() : 모두 소문자로

- trim() : 문자열의 앞, 뒤 공백 제거(한쪽만은 불가능) 