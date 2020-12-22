package PG_전화번호목록;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){
                if(i != j && phone_book[j].length() >= phone_book[i].length() ){
                    if(phone_book[j].indexOf(phone_book[i])==0){
                        return false;
                    }
                }
            }
        }
        return answer;
    }
}