package Tuple;
import java.util.*;
public class Solution {

    static public int[] solution(String s) {
        int[] answer = {};
        StringBuilder std = new StringBuilder(s);
        std = new StringBuilder(std.substring(1, std.length()-1));
        String[] str = std.toString().split("},");
        List<List<Integer>> numList = new ArrayList<>();
        for(String stt : str){
            stt = stt.replace("{","");
            stt = stt.replace("}","");
            String[] nums = stt.split(",");
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                list.add(Integer.parseInt(nums[i]));
            }

            numList.add(list);

        }
        numList.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.size() - o2.size();
            }
        });
        List<Integer> anseer = new ArrayList<>();
        anseer.add(numList.get(0).get(0));
        List<Integer> pre = numList.get(0);
        for(int i = 1 ; i < numList.size(); i++){
            List<Integer> arr = numList.get(i);
            for(Integer num : arr){
                if(!pre.contains(num)){
                    anseer.add(num);
                    continue;
                }
            }
            pre = arr;
        }
        answer = new int[anseer.size()];
        for(int i = 0; i < anseer.size(); i++){
            answer[i] = anseer.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
    }
}
