package 배열합치기;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int idx1 = 0;
        int idx2 = 0;
        List<Integer> result = new ArrayList<>();
        for(String num : arr1){
            result.add(Integer.parseInt(num));
        }
        for(String num : arr2){
            result.add(Integer.parseInt(num));
        }
        Collections.sort(result);
        for(int str : result){
            System.out.print(str +" ");
        }
        System.out.println();
    }
}