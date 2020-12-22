package 조합0의개수_2004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		long n = Long.parseLong(s.split(" ")[0]);
		long m = Long.parseLong(s.split(" ")[1]);
		
		int cnt2 = 0;
		int cnt5 = 0;
		for(int i = 2; i <= n; i*=2) cnt2 += n/i;
		for(int i = 5; i <= n; i*=5) cnt5 += n/i;
		
		for(int i = 2; i <= m; i*=2) cnt2 -= m/i;
		for(int i = 5; i <= m; i*=5) cnt5 -= m/i;
		for(int i = 2; i <= (n-m); i*=2) cnt2 -= (n-m)/i;
		for(int i = 5; i <= (n-m); i*=5) cnt5 -= (n-m)/i;
		
		int num = Math.min(cnt2, cnt5);
		
		bw.write(num+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
	

}