class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        int min = prices[0];
        for(int i =0;i<n;i++){
            if (min>prices[i]){
                min = prices[i];
            }
            else{
                res = Math.max(res,prices[i]-min);
            }
        }
        return res;
    }
}
