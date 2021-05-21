package 완주하지못한선수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashSet<String> set = new HashSet();
        for(String str : participant){
            set.add(str);
        }
        for(String str: completion){
            set.remove(str);
        }
        Iterator<String> iterator = set.iterator();
        return iterator.next();
    }

    public static void main(String[] args) {

    }
}
