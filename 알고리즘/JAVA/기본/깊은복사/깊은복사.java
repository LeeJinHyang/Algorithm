package 깊은복사;

public class 깊은복사 {

public static void main(String[] args){
  //  int [][] original = new int[3][3];
    int [][] copy = new int[3][3];
    int cnt = 0;
    int[][] original = {
    		{1,2,3},
    		{4,5,6},
    		{7,8,9}
    };
    print(original);
    print(copy);
    for(int[] temp : original){
        copy[cnt++] = temp.clone(); 
    }
    System.out.println("!!");
    
    print(copy);
    //또는

    for(int i=0; i<original.length; i++){
        copy[i] = original[i].clone();
    }

    print(original);
    print(copy);
    
    
    original[2][2] = 82;
    
    copy[1][1] = 47;
    

    print(original);
    print(copy);
    
}
static void print(int[][] map) {
	for(int r = 0; r < map.length; r++) {
    	for(int c = 0; c < map.length;c++) {
    		System.out.print(map[r][c]+" ");
    	}
    	System.out.println();
    }
	System.out.println();
}
}