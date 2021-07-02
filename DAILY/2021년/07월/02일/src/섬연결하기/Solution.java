package 섬연결하기;
import java.util.*;
class Solution {
    static int[] parent;
    static int find(int x){
        if(parent[x] == x) return x;
        else return find(parent[x]);
    }
    static class Point implements Comparable<Point>{
        int n1;
        int n2;
        int cost;
        Point(int n1, int n2, int cost){
            this.n1 = n1;
            this.n2 = n2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Point p){
            return this.cost - p.cost;
        }
    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n+1];
        for(int i = 0; i <=n ; i++){
            parent[i] = i;
        }
        PriorityQueue<Point> que = new PriorityQueue<>();
        for(int[] arr:costs){
            que.add(new Point(arr[0], arr[1], arr[2]));
        }
        while(!que.isEmpty()){
            Point p = que.poll();
            if(find(parent[p.n1]) != find(parent[p.n2])){
                parent[find(parent[p.n1])] = find(parent[p.n2]);
                answer += p.cost;
            }
        }

        return answer;
    }
}