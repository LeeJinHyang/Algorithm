package PG_주식가격;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length-1; i++){
            int count = 0;
            for(int j = i+1; j < prices.length; j++){
                answer[i] = j - i;
                    
                if((prices[i] > prices[j])){
                    break;
                }
                
            }
        }
        return answer;
    }
}