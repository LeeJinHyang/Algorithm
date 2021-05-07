package 비정상응모자ㅏ;

public class Solution {

    static public int solution(String[] user_id, String[] banned_id) {
        int answer = 1;
        for(String masking : banned_id){
            for(int i = 0 ; i < user_id.length; i++){
                int cnt = 0;
                String id = user_id[i];
                if(masking.length() == id.length()){
                    boolean flag = false;
                    for(int ch = 0; ch < id.length(); ch++){
                        if(!(masking.charAt(ch)!= '*' && masking.charAt(ch) == id.charAt(ch))){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        cnt++;
                    }
                }


            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
