class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxP=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i]; //best day to buy and sell
            }else{
                maxP=Math.max(maxP,prices[i]-minPrices);
            }
        }
        return maxP;
    }
}
