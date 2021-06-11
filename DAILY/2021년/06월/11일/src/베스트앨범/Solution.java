package 베스트앨범;

import java.util.*;
class Solution {
    static class Point{
        int index;
        int count;
        Point(int index, int count){
            this.index = index;
            this.count = count;
        }

        public int getIndex(){
            return this.index;
        }
        public int getCount(){
            return this.count;
        }
    }
    static class Genres{
        String genre;
        int count;
        Genres(String genre, int count){
            this.genre = genre;
            this.count = count;
        }
        public String getGenre(){
            return this.genre;
        }
        public int getCount(){
            return this.count;
        }
    }
    static public int returnSum(List<Point> list){
        int sum = 0;
        for(Point p : list){
            sum += p.count;
        }
        return sum;
    }
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> result = new LinkedList();
        Map<String, List<Point>> map = new HashMap();
        for(int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int count = plays[i];
            if(!map.isEmpty() && map.containsKey(genre)) {
                List<Point> list = map.get(genre);
                list.add(new Point(i, count));
                map.put(genre, list);
            }
            else{
                List<Point> list = new LinkedList();
                list.add(new Point(i, count));
                map.put(genre, list);
            }
        }

        List<Genres> maxList = new LinkedList();
        for (Map.Entry<String, List<Point>> entry : map.entrySet()) {
            List<Point> list = entry.getValue();
            int sum = returnSum(list);
            maxList.add(new Genres(entry.getKey(), sum));

        }
        //가장 먼저 나오는 장르가 가장 재생횟수가 많은 장르
        Collections.sort(maxList, new Comparator<Genres>() {
            @Override
            public int compare(Genres s1, Genres s2) {

                return s2.getCount() - s1.getCount();
            }
        });
        for(Genres gen : maxList){
            String grs = gen.getGenre();
            List<Point> pointList = map.get(grs);
            Collections.sort(pointList, new Comparator<Point>() {
                @Override
                public int compare(Point s1, Point s2) {
                    return s2.getCount() - s1.getCount();
                }
            });
            for(int i = 0; i < 2 && i < pointList.size(); i++){
                Point p = pointList.get(i);
                result.add(p.getIndex());

            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}