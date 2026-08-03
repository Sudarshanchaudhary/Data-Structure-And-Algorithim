class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
           
           if(prices[i]< minProfit){
            minProfit=prices[i];
           }
           int profit=prices[i] - minProfit;
           if(profit> maxProfit){
            maxProfit=profit;
           }
        }
        return maxProfit;
    }
}