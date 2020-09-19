package PG_제일작은수제거하기;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int idx = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(idx >= arr[i]) idx = arr[i];
        }
        System.out.println(idx);
        int[] temp = new int[arr.length];
        int num = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != idx){
             num++;   
            }
        }
        if(num == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[num];
            int j = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != idx){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }
        return answer;
    }
}