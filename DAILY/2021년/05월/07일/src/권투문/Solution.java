package 권투문;

public class Solution {
    static int[] parent;
    static public int solution(int n, int[][] results) {
        int answer = 0;
        //1대 1 방식으로 진행
        //Ar가 B보다 실력이 좋다면 항상 이긴다
        //N : 선수의 수
        //경기 결과를 담은 2차원 배열

        //이차원 배열을 만들고
        //a가 b를 이기면 map[a][b] = a, map[b][a] = a를 담는다
        //결과의 모순은 없다
        //parent
        parent = new int[n+1];
        //부모관계를 성립해주고
        for(int [] arr : results){
            parent[arr[1]] = arr[0];
        }

        return answer;
    }
    public static void main(String[] args) {


    }
}
