package 오픈채팅;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static class History{
        String uid;
        boolean status;//들어옴은 true, 나감은 false;
        History(String uid, boolean status){
            this.uid = uid;
            this.status = status;
        }
    }
    static public String[] solution(String[] record) {

        Map<String, String> user = new HashMap<>();
        List<History> histories = new ArrayList<>();
        //나가고 들어옴을 id를 이용해서 표시하고
        //마지막 출력 전에 Map<uid, nickname>을 에서 uid를 이용해 nickname + 들어옴/나옴이 출력되도록 한다
        //시간 순서에 맞게 list를 통해 나가고 들어옴을 표시한다
        for(String str : record){ //들어옴
            String[] order = str.split(" ");
            System.out.println(order.length);
            if(order[0].equals("Enter")){
                user.put(order[1], order[2]);
                histories.add(new History(order[1], true));
            }
            else if(order[0].equals("Leave")){ //나감
                histories.add(new History(order[1], false));
            }
            else { //닉 바꿈
                user.put(order[1], order[2]);
            }


        }
        String[] answer = new String[histories.size()];
        for(int i = 0; i < histories.size(); i++){
            History history = histories.get(i);
            String nickname = user.get(history.uid);
            if(history.status){ // 들어온 경우

                answer[i] = nickname+"님이 들어왔습니다.";
            }
            else{ //나간경우
                answer[i] = nickname+"님이 나갔습니다.";
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] array  = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(array);
    }
}
