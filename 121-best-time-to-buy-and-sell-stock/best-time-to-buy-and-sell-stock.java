class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];
        for( int price:prices){

            maxprofit = Math.max(maxprofit , price - minprice);

            minprice = Math.min(minprice, price);
        }
        return maxprofit;
    }
}