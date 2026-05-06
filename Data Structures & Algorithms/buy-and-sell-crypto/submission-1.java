class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int res = 0;
        int min = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>min){
                res = Math.max(res,prices[i]-min);
            }
            else{
                min = prices[i];
            }
        }
        return res;
    }
}
