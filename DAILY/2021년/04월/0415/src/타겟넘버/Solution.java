package Å¸°Ù³Ñ¹ö;

public class Solution {

    static int result;
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        //´õÇÏ°Å³ª »©¼­
        result = 0;
        perm(numbers[0] * (-1) , numbers, target, 1);
        perm(numbers[0] , numbers, target, 1);
        
        return result;
    }
    public static void perm(int num, int[] numbers, int target, int count){
        if(count == numbers.length){
            if(num == target){
            result++;
            }
            return;
        }
        perm(num + numbers[count], numbers, target, count+1);
        perm(num - numbers[count], numbers, target, count+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,1,1,1}; 
		int rst = solution(array, 3);
		System.out.println(rst);
	}

}
