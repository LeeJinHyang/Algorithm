package 탈주범검거_1953;

import java.util.*;

public class Solution {
	static class Point{
		int x;
		int y;
		int time;
		Point(int x, int y, int time){
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
	static int L;
	static int[][] map;
	static boolean[][] visited;
	static int result;
	static int[] rd = {-1,1,0,0};
	static int[] cd = {0,0,-1,1};
<<<<<<< HEAD
	static HashMap<String, Integer[]> hashmap;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmap = new HashMap<>();
		hashmap.put("1", {0,1,2,3});
=======
	static LinkedList<Integer[]> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer[]> list = new LinkedList();
		Integer[] arr = {0,1,2,3};
		list.add(arr);
		arr = {0,1};
		list.add(arr);
>>>>>>> a3c79369cb237055f5f743ba83350696994de382
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int R = sc.nextInt();
			int C = sc.nextInt();
			L = sc.nextInt();
			map = new int[N][M];
			visited = new boolean[N][M];
			result = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					int s = sc.nextInt();
					map[i][j] = s;
				}
			}
			bfs(new Point(R,C,1));
			System.out.println("#"+tc+" "+result);
		}
	}
	
	static void bfs(Point point ) {
		Queue<Point> que = new LinkedList<>();
		que.add(point);
		while(!que.isEmpty()) {
			Point front = que.poll();
			if(front.time == L) {
				if(!visited[front.x][front.y]&& map[front.x][front.y]!=0) {
					visited[front.x][front.y] = true;
					result ++;
				}
			}
			else if(front.time < L){
				int num = map[front.x][front.y];
				if(num != 0) {
					que.add(new Point(front.x, front.y,  front.time+1));
					if(num == 1) {
					//1은 0,1,2,3
						if(check(front.x + rd[0],front.y + cd[0])) {
							que.add(new Point(front.x + rd[0],front.y + cd[0],front.time+1));
						}
						if(check(front.x + rd[1],front.y + cd[1])) {
							que.add(new Point(front.x + rd[1],front.y + cd[1],front.time+1));
						}
						if(check(front.x + rd[2],front.y + cd[2])) {
							que.add(new Point(front.x + rd[2],front.y + cd[2],front.time+1));
						}
						if(check(front.x + rd[3],front.y + cd[3])) {
							que.add(new Point(front.x + rd[3],front.y + cd[3],front.time+1));
						}
					}else if(num == 2) {
					//2는 0,1
						if(check(front.x + rd[0],front.y + cd[0])) {
							que.add(new Point(front.x + rd[0],front.y + cd[0],front.time+1));
						}
						if(check(front.x + rd[1],front.y + cd[1])) {
							que.add(new Point(front.x + rd[1],front.y + cd[1],front.time+1));
						}
					}else if(num == 3) {
					//3은 2,3
						if(check(front.x + rd[2],front.y + cd[2])) {
							que.add(new Point(front.x + rd[2],front.y + cd[2],front.time+1));
						}
						if(check(front.x + rd[3],front.y + cd[3])) {
							que.add(new Point(front.x + rd[3],front.y + cd[3],front.time+1));
						}
					}else if(num == 4) {
					//4는 0,3
						if(check(front.x + rd[0],front.y + cd[0])) {
							que.add(new Point(front.x + rd[0],front.y + cd[0],front.time+1));
						}
						if(check(front.x + rd[3],front.y + cd[3])) {
							que.add(new Point(front.x + rd[3],front.y + cd[3],front.time+1));
						}
					}else if(num == 5) {
					//5는 1,3
						if(check(front.x + rd[1],front.y + cd[1])) {
							que.add(new Point(front.x + rd[1],front.y + cd[1],front.time+1));
						}
						if(check(front.x + rd[3],front.y + cd[3])) {
							que.add(new Point(front.x + rd[3],front.y + cd[3],front.time+1));
						}
					}else if(num == 6) {
					//6은 1,2
						if(check(front.x + rd[2],front.y + cd[2])) {
							que.add(new Point(front.x + rd[2],front.y + cd[2],front.time+1));
						}
						if(check(front.x + rd[1],front.y + cd[1])) {
							que.add(new Point(front.x + rd[1],front.y + cd[1],front.time+1));
						}
					}else if(num == 7) {
					//7은 0,2
						if(check(front.x + rd[0],front.y + cd[0])) {
							que.add(new Point(front.x + rd[0],front.y + cd[0],front.time+1));
						}
						if(check(front.x + rd[2],front.y + cd[2])) {
							que.add(new Point(front.x + rd[2],front.y + cd[2],front.time+1));
						}
					}
				}
			}
		}
	}
	static boolean check(int x, int y) {
		if(x >= 0 && x < map.length && y >= 0 && y <map[0].length) {
			return true;
		}
		else return false;
	}

}
