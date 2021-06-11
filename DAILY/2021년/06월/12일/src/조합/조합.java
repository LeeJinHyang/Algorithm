package 조합;

import java.util.Collections;
import java.util.Comparator;

public class 조합 {
    static int[] arr = {1,2,3,4};
    static int[] result;
    static void Comb(int idx, int s_idx){
        if(s_idx == result.length){
            for(int num : result){
                System.out.print(num +" ");
            }
            System.out.println();
            return;
        }
        if(idx == arr.length) return;

        result[s_idx] = arr[idx];
        Comb(idx+1, s_idx+1);
        Comb(idx+1, s_idx);

    }
    public static void main(String[] args) {
        result = new int[3];
        Comb(0,0);

        int arr = 10;
    }
}
