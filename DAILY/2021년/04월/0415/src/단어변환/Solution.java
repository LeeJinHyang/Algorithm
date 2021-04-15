package 단어변환;

public class Solution {
	
	 static String targ;
	    static int result;
	    public static void Dfs(String mid, boolean[] visited, String[] words,int count){
	        if(targ.equals(mid)){
	            result = count;
	            return;
	        }
	        
	        for(int i =0; i < words.length; i++){
	            
	            if(visited[i])
	            {
	            	continue;
	            }
	            String tmp = words[i];
	            int cnt = 0;
	            for(int j = 0; j < tmp.length(); j++){
	                if(tmp.charAt(j) == mid.charAt(j)){
	                    cnt ++;
	                }
	                
	            }
	            
	            if(cnt == tmp.length() - 1){
	                visited[i] = true;
	                Dfs(tmp, visited, words, count+1);
	                visited[i] = false;
	            }
	            
	        }
	        
	    }
	    public static int solution(String begin, String target, String[] words) {
	        int answer = 0;
	        targ = target;
	        result = 0;
	        Dfs(begin, new boolean[words.length], words, 0);
	        
	        return result;
	    }

	    
	public static void main(String[] args) {
		String[] tmpp = {"hot", "dot", "dog", "lot", "log", "cog"};
		int result = solution("hit", 	"cog", tmpp);
		System.out.println(result);
}
}
