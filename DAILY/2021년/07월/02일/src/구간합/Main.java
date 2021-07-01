package 구간합;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] str = br.readLine().split(" ");
        String[] order = br.readLine().split(" ");
        int num = 0;
        for(int i = Integer.parseInt(order[0])-1; i <Integer.parseInt(order[1]); i++ ){
            num += Integer.parseInt(str[i]);
        }
        System.out.println(num);
    }
}
}