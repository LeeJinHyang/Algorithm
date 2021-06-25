package num2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Solution {
    static boolean compareDate(String fileDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(fileDate,formatter);
        LocalDate targetDate = LocalDate.parse("1990-01-31", formatter);
        if(date.isAfter(targetDate)) return true;
        else return false;
    }
    static boolean checklast(String str){
        if(str.charAt(str.length() -1) == '~') return true;
        else return false;
    }
    static boolean compareNum(String str){
        //7M 파일은 7*2^20바이트
        //K = 2^10 = 1024
        //M = 2^20
        //G = 2^30
        //14 * 2 ^ 20보다 작으면 true
        //크면 false return
        //숫자로 용량이 주어졌을 때 마지막 문자가 K 등의 단위일 때
        str = str.trim();
        char lastChar = str.charAt(str.length() -1);
        double num = 0;
        if(lastChar == 'K'){
            num = Double.parseDouble(str.substring(0, str.length() -1));
            num = num/ 1024;
        }else if(lastChar == 'M'){
            num = Double.parseDouble(str.substring(0, str.length() -1));

        }else if(lastChar == 'G'){
            num = Double.parseDouble(str.substring(0, str.length() -1));
            num = num * 1024;
        }
        else {//순수 그대로 수
            num = Double.parseDouble(str);
            num = num / 1024 /1024;
        }
        if(num < 14) return true;
        else return false;
    }
    static public String solution(String S) {
        // write your code in Java SE 8
        int minLength = 987654321;

        String[] str = S.split("\\n");
        for(String tmp : str){

            tmp = tmp.trim();
            String[] orders = tmp.split(" ");

            if(!checklast(orders[orders.length-1])) continue;
            if(!compareNum(orders[0])) continue;
            if(!compareDate(orders[1])) continue;
            String result = orders[2].split("[.]")[0];
            result = result.trim();
            minLength = Math.min(minLength, result.length());
        }
        if(minLength == 987654321) return "NO FILES";
        return Integer.toString(minLength);
    }

    public static void main(String[] args) {
        String str = "715K 2009-09-23 system.zip ~ \n" +
                "179K 2013-08-14 to-do-list.xml ~ \n" +
                "645K 2013-06-19 blockbuster.mpeg ~ \n" +
                "  536 2010-12-12 notes.html \n" +
                "688M 1990-02-11 delete-this.zip ~ \n" +
                "  23K 1987-05-24 setup.png ~ \n" +
                "616M 1965-06-06 important.html \n" +
                "  14M 1992-05-31 critical-module.java ~ \n" +
                "192K 1990-01-31 very-long-filename.dll ~";
        String last = " 715K 2009-09-23 system.zip~\\n 179K 2013-08-14 to-do-list.xml~\\n 645K 2013-06-19 blockbuster.mpeg~\\n  536 2010-12-12 notes.html\\n 688M 1990-02-11 delete-this.zip~\\n  23K 1987-05-24 setup.png~\\n 616M 1965-06-06 important.html\\n  14M 1992-05-31 crucial-module.java~\\n 192K 1990-01-31 very-long-filename.dll~'";
        String result = solution(last);
        System.out.println(result);
    }
}
