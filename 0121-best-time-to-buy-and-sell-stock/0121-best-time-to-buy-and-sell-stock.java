class Solution{
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy+1;
        int curr = 0;
        int max = 0;

        while(sell<prices.length){
            if(prices[buy]>prices[sell]){
                buy=sell;
                sell = buy+1;
                continue;
            }
            
                max = Math.max(prices[sell]-prices[buy],max);
            sell++;
        }

        return max;
    }
}