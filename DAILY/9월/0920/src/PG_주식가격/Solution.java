package PG_�ֽİ���;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer =  new int[prices.length];
        for(int i = 0; i < prices.length-1; i++){
            int num = 0;
            //���������� ���鼭 üũ�Ѵ�
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] < prices[i]){
                    num++;
                    break;
                }
                else num = j -i;
            }
            answer[i] = num;
        }
        return answer;
    }
}