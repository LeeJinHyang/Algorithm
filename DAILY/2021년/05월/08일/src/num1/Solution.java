package num1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<String, String> key;
    //key추가하는 함수
    static void addKey(){
        key = new HashMap<>();

        key.put("zero","0");
        key.put("one","1");
        key.put("two","2");
        key.put("three","3");
        key.put("four","4");
        key.put("five","5");
        key.put("six","6");
        key.put("seven","7");
        key.put("eight","8");
        key.put("nine","9");

    }
    static public int solution(String s) {
        int answer = 0;
        //1. map에 key와 value 넣고
        addKey();
        StringBuilder std = new StringBuilder(s);
        StringBuilder answerStd = new StringBuilder();
        //2. key값만 가진 array를 두고 -> Arrays.asList(key.keySet()).contains()로
        //Arrays.asList(key.keySet()).contains();
        //3. 문자열이 숫자가 아니면 그 index부터 3번째칸이랑 비교해서 같은게 있는지 체크
        while(std.length()> 0) {
            if (std.charAt(0) >= '0' && std.charAt(0) <= '9') {
                answerStd.append(std.charAt(0));
                if (std.length() >= 1) {

                    std = new StringBuilder(std.substring(1));
                }
            } else {
                for (int i = 3; i < 6; i++) {
                    boolean flag = true;
                    if (key.containsKey(std.substring(0, i))) {
                        answerStd.append(key.get(std.substring(0, i).toString()));
                        if (std.length() >= i) {
                            std = new StringBuilder(std.substring(i));
                        }
                        flag = false;
                    }
                    if(!flag) break;

                }
            }
            //4. 만약에 3번에 해당하는게 없다면 최대 5까지 반복(이 숫자를 offset이라고 한다)

            //5. index = index + offset

            //계속반복

        }
        answer = Integer.parseInt(answerStd.toString());
        return answer;
    }
    public static void main(String[] args) {
        solution("one4seveneight");
        addKey();

    }
}
