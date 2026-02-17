class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int max = 0;
        for(int price : prices){
           lowestPrice =  Math.min(lowestPrice,price);
           int profit = price-lowestPrice;
           max = Math.max(profit,max);
        }
        return max;
    }
}