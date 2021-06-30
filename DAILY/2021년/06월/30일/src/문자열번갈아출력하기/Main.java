package 문자열번갈아출력하기;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder std = new StringBuilder();
        int startIdx = 0;
        int endIdx = input.length() -1;
        while(startIdx <= endIdx){
            std.append(input.charAt(startIdx));
            if(startIdx != endIdx){
                std.append(input.charAt(endIdx));
            }
            startIdx ++;
            endIdx --;
        }
        System.out.println(std.toString());
    }
}