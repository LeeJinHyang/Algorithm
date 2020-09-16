import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int[] temp = new int[arr.length];
        int idx = 1;
        temp[0] = arr[0];
        for(int i= 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
              temp[idx] = arr[i];
                idx++;
            }
            
        }
        answer = new int[idx];
        for(int i = 0; i < idx; i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}