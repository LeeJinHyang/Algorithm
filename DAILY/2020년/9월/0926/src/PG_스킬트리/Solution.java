package PG_스킬트리;

import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < skill.length(); i++){
            map.put(skill.charAt(i),i);
        }
        
        for(int tc = 0; tc < skill_trees.length; tc++ ){
            String tree = skill_trees[tc];
            boolean[] check = new boolean[skill.length()];
            for(int i = 0; i < tree.length(); i++){
                char ch = tree.charAt(i);
                if(map.containsKey(ch)){
                    int index = map.get(ch);
                    if(index == 0) check[index] = true;
                    else {
                        if(check[index -1]){
                            check[index] = true;
                        }
                        else break;
                    }
                    
                }
                
                if(i == tree.length() - 1) answer ++;
            }
        }
        return answer;
    }
}