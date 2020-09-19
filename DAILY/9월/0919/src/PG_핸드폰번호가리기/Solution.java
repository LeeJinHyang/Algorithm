package PG_핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder std = new StringBuilder(phone_number);
        for(int i = std.length() -5; i >=0; i--){
            std.setCharAt(i,'*');
        }
        answer = std.toString();
        return answer;
    }
}