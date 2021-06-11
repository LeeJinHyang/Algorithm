package 전화번호목록;
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
            String pivot = phone_book[i];
            String target = phone_book[i+1];
            if(target.startsWith(pivot)){
                return false;
            }
        }
        return answer;
    }
}
