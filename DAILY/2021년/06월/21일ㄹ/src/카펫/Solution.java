package 카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        //각각의 수는 기억했지만 전체 크기는 기억X
        //갈색 = 가로*2 + 세로 * 2 -4
        //노란색 (가로 -2) * (세로 -2)

        //가로 + 세로 = 갈색/2 + 2
        // 노란색 = 가로 * 세로 - 2 * (가로+세로) + 4
        //가로 * 세로 = 노란색 + 2 * (가로 + 세로) - 4
        int x = 0;
        int y = 0;
        int sum = brown/2 +2;
        int mux = yellow + 2 *sum - 4;
        int i = 1;
        answer = new int[2];
        while(true){
            int j = mux / i;
            if(mux % i == 0 && i + j == sum){

                answer[0] = j;
                answer[1] = i;
                break;

            }
            i++;

        }
        return answer;
    }
}