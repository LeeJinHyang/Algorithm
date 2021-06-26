package 최솟값만들기;

import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //A의 min 과 B의 max를 곱해야 한다
        Arrays.sort(A);
        Arrays.sort(B);
        // Arrays.sort(B, Collections.reverseOrder()); -> Integer[] 일 때 사용 가능하다

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}