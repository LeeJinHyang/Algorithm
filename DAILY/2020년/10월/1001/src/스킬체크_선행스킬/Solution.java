package 스킬체크_선행스킬;

import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < skill.length(); i++ ){
            map.put(skill.charAt(i),i);
        }
        for(int i = 0; i < skill_trees.length; i++){
            boolean flag = true;
            String str = skill_trees[i];
            boolean[] check = new boolean[skill.length()];
        
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(map.containsKey(ch)){
                    int index = map.get(ch);
                    if(index == 0) check[index] = true;
                    else{
                        if(check[index -1]) check[index] = true;
                        else{
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                 answer++;
            }
            
        }
        return answer;
    }
}