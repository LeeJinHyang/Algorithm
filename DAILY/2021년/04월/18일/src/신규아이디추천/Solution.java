package �űԾ��̵���õ;

import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1. �ҹ���
        
        new_id = new_id.toLowerCase();
        StringBuilder std = new StringBuilder(new_id);
        //2. ���ĺ� �ҹ���, ����, ����, ����, ��ħǥ ������ ��� ���� ����
        for(int i = 0; i < std.length(); i++){
            char ch = std.charAt(i);
            if(!((ch>='a' && ch <= 'z') || ch == '-' || ch == '_' || ch=='.' || (ch >= '1' && ch <= '9'))  ){
                std.deleteCharAt(i);
                i--;
            }
        }
        //3. .�������� .���� ��ü
        for(int i = 0; i < std.length()-1; i++){
            char ch = std.charAt(i);
            if(ch=='.'){
                for(int j = i+1; j < std.length(); j++){
                    if(std.charAt(j)!= '.'){
                        break;
                    }
                    else{
                        std.deleteCharAt(j);
                        j--;
                    }
                }
                
            }
        }
        //4. .�� �� ó���̳� ������ �����ϸ� ����
        if(std.charAt(0) == '.'){
            std.deleteCharAt(0);
        }
        if(std.length()-1 >= 0 && std.charAt(std.length()-1) == '.'){
            std.deleteCharAt(std.length()-1);
        }
        //5. ���̵� �� ���ڿ��̸� a�� ����
        if(std.length() == 0){
            std.append('a');
        }
        //6. 16�̻��̶�� 15�ڱ����� �츮�� ���� ������ �� ������ .�̸� ����
        if(std.length() >= 16){
            System.out.println(std.toString());
            std = new StringBuilder(std.substring(0,15));
                        System.out.println(std.toString());
            if(std.charAt(std.length()-1) == '.'){
                std.deleteCharAt(std.length()-1);
            }
        }
        //7. 2�� ���ϸ� ������ ���ڸ� 3�� �ǰ� ���� ���δ�
        if(std.length() <= 2){
            char last = std.charAt(std.length()-1);
            while(std.length() != 3){
            std.append(last);
            }
        }
        return std.toString();
    }
}