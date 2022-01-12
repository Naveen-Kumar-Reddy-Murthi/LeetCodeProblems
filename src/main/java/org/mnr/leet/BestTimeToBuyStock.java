package org.mnr.leet;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

        int[] prices = new int[] {7,1,5,3,6,4};
        int[] prices1 = new int[] {7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minStockValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minStockValue){
                minStockValue= prices[i];
            }else {
                maxProfit = Math.max(maxProfit, prices[i]-minStockValue);
            }
        }
        return maxProfit;
    }
}
