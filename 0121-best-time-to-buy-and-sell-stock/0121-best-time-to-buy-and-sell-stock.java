class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0], maxsofar = prices[0];
        int maxprofit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minsofar){
                minsofar = prices[i];
                maxsofar = prices[i];
            }
            else{
                maxsofar = Math.max(maxsofar, prices[i]);
            }
            
            maxprofit = Math.max(maxprofit, maxsofar - minsofar);
        }
        return maxprofit;
    }
}