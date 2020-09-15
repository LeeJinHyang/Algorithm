import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        LinkedList<Integer> ans = new LinkedList();
        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int num = numbers[i] + numbers[j];
                if(!ans.contains(num)) ans.add(num);
            }
        }
        answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}