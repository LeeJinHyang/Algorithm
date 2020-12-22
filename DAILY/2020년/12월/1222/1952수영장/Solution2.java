public class Solution2 {
    static int minPrice;
    static int[] plan;
    static int oneDayPrice;
    static int oneMonthPrice;
    static int threeMonthPrice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            oneDayPrice = sc.nextInt();
            oneMonthPrice = sc.nextInt();
            threeMonthPrice = sc.nextInt();
            int oneYearPrice = sc.nextInt();


            plan = new int[13];
            for(int i = 1; i <= 12; i++){
                plan[i] = sc.nextInt();
            }
        minprice = Integer.MAX_VALUE;
        minPrice(0,0);
        int result = Math.min(minprice, oneYearPrice);
        System.out.println("#"+tc+" "+ result);
    }
}
    public static  void minPrice(int month, int price){
        if(price >= minprice) return;
        if(month == 13) {
            minprice = Math.min(minprice, price);
        }
        if(plan[month] == 0){
            minPrice(month+1,price);
        }
        else{
        minPrice(month+1, price + oneDayPrice *plan[month]);
        minPrice(month+1, price + oneMonthPrice);
        minPrice(month+3, price + threeMonthPrice);
        }

    }


}
