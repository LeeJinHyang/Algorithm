package 영어끝말잇기;

import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> visitedWord = new HashSet<>(); //기존에 나온 단어인지
        int idx = 0;
        char lastWord = words[0].charAt(words[0].length() -1);
        visitedWord.add(words[0]);
        for(int i = 1; i < words.length; i++){
            String str = words[i];

            if(lastWord == str.charAt(0) && !visitedWord.contains(str)){
                lastWord = str.charAt(str.length() -1);
                visitedWord.add(str);
            }else {
                idx = i;
                break;
            }
        }
        if(idx == 0) return answer;

        answer[0] = idx % n + 1;
        answer[1] = idx / n + 1;
        return answer;
    }
}