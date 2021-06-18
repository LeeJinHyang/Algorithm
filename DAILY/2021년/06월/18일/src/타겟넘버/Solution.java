package 타겟넘버;

class Solution {
    static int targetNum;
    static int cnt;
    static void dfs(int[] numbers, int idx, int num){
        if(idx == numbers.length){
            if(num == targetNum) cnt++;
            return;
        }
        dfs(numbers, idx+1, num - numbers[idx]);
        dfs(numbers, idx+1, num + numbers[idx]);

    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        targetNum = target;
        cnt = 0;
        dfs(numbers, 0, 0);
        return cnt;
    }
}