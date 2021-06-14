package UnionFind;

public class Solution {
    static int[] parent;
    static public int findParent(int x){
        if(parent[x]== x) {
            return x;
        }
        else return findParent(parent[x]);
    }
    static public void union(int x, int y){
        int parentX = findParent(x);
        int parentY = findParent(y);
        parent[x] = parentY;
    }
    public static void main(String[] args) {
        int N = 10;
        parent = new int[N];
        for(int i = 0; i < N; i++){
            parent[i] = i;
        }

    }
}
