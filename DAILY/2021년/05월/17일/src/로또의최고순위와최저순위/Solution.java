package 로또의최고순위와최저순위;

import java.util.ArrayList;

public class Solution {
    static public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0;
        ArrayList<Integer> winNum = new ArrayList<>();

        for(int winNums : win_nums){
            winNum.add(winNums);
        }
        int removeNum = 0;
        for(int lotto : lottos){

            if(lotto != 0 && winNum.contains(lotto)){
                win ++;
                winNum.remove(winNum.indexOf(lotto));

            }
            else if(lotto == 0){
                removeNum++;
            }
        }
        if(win >= 2) answer[1] = 7 - win;
        else answer[1] = 6;
        if(win+removeNum >= 2) answer[0] = 7 - win - removeNum;
        else answer[0] = 6;

        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {44,1,0,0,31,25};
        int[] arr2 = {31,10,45,1,6,19};
        solution(arr1, arr2);
    }
}
