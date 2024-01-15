class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int cp=prices[0];               
        int maxProfit=0;                
        for(int i=1;i<n;i++){
            int sp=prices[i];           
            int profit=sp-cp;           
            maxProfit=Math.max(profit,maxProfit);
            cp=Math.min(cp,sp);
        }
        return maxProfit;
    }
}
