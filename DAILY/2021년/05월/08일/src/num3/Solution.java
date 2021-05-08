package num3;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    static public String solution(int n, int k, String[] cmd) {
        StringBuilder answer = new StringBuilder();
        //boolean으로 크기가 n인 array를 만든다
        boolean[] map = new boolean[n];
        Arrays.fill(map, false);
        LinkedList<Integer> dataList = new LinkedList<>();
        for(int i = 0 ; i < n; i++){
            dataList.add(i);
        }
        //삭제된 노드를 담는 stack 하나
        Stack<Integer> delete = new Stack<>();
        for(String cmdStr : cmd){
            char ch = cmdStr.charAt(0);


            if(ch == 'U'){ //위로 올라가는 명령
                int goal = Integer.parseInt(cmdStr.substring(2));
                if(k <= goal){
                    k = 0;
                }
                else{
                    k -= goal;
                }

            }

            else if(ch == 'D'){ //밑으로 내려가는 명령
                int goal = Integer.parseInt(cmdStr.substring(2));

                if(dataList.size() - k - 1 < goal){
                    k = dataList.size()-1;
                }
                else{
                    k+= goal;
                }
            }

            else if(ch == 'C'){ // 삭제명령
                delete.push(dataList.get(k));

                //해당 리스트 삭제
                dataList.remove(k);

                //위로 가는 경우
                if(dataList.size() ==  k){ //마지막index를 삭제하고자 할 때
                    k = dataList.size() -1;
                }
            }else if(ch == 'Z'){ //삭제 돌려놓는 명랴ㅕㅇ
                Integer deleteIdx = delete.pop();
                if(deleteIdx < dataList.get(k)){ // 내위의 인덱스가 복구된 경우
                    k ++;
                }
                dataList.addLast(deleteIdx);
                Collections.sort(dataList);

            }
        }
        for(int i = 0; i < dataList.size(); i++){
            map[dataList.get(i)] = true;
        }
        for(int i = 0; i < map.length; i++){
            if(map[i]) {
                answer.append("O");
            }
            else{
                answer.append("X");
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String[] array = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
        String[] array2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
        System.out.println(solution(8, 2, array));
    }
}
