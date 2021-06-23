package 스킬트리;

import java.util.*;
class Solution {
    static String skills;
    static boolean resultCheck(String target){
        boolean[] skillCheck = new boolean[skills.length()];
        Map<String, Integer> skillMap = new HashMap<>();
        for (int i = 0; i < skills.length(); i++){
            skillMap.put(skills.charAt(i)+"", i);
        }
        for(int i = 0; i < target.length(); i++){
            String str = target.charAt(i)+"";
            if(skillMap.containsKey(str)){
                int idx = skillMap.get(str);
                if(idx == 0) skillCheck[idx] = true;
                else{
                    if(skillCheck[idx-1]) skillCheck[idx] = true;
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        //스파크 -> 라이트닝 볼트 -> 껀더
        //썬더를 배우려면 라이트닝 볼트를 배워야 한다
        //CBD니까 문자열에
        //D있으면 앞에 B 있는지 체크하는 함수 만들어야 한다
        skills = skill;
        for(String str : skill_trees){
            if(resultCheck(str)) answer++;
        }
        return answer;
    }
}