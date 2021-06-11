package 순열;

public class 순열 {
    static int[] arr = {1,2,3,4};
    static boolean[] visited;
    static int[] nums;
    static void Perm(int s_idx){
        if(s_idx == nums.length){
            for(int num : nums){
                System.out.print(num + "  ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                nums[s_idx] = arr[i];
                Perm(s_idx+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        visited = new boolean[4];
        nums = new int[3];
        Perm(0);
    }
}
