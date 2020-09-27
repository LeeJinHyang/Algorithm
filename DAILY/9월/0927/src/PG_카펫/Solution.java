package PG_카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // w * h = brown + yellow = multi
        // h + w = brown/2 + 2 = plus
        int plus = brown/2 + 2;
        int multi = brown + yellow;
        System.out.println(plus);
        System.out.println(multi);
        int w = 0;
        int h = 0;
        for(int i = 1; i <= multi/2; i++ ){
            if(multi % i == 0){
                if(i + multi/i == plus){
                    if(i >= multi/i ) {
                        w = i;
                        h = multi/i;
                    }
                    else {
                        h = i;
                        w = multi/i;
                    }
                } 
            }
        }
        answer[0] = w;
        answer[1] = h;
        return answer;
    }
}