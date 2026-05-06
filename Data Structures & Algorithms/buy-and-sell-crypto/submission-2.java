class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        int s= prices[0];
        //int min = prices[0];
        for(int i =1;i<n;i++){
            if(s>prices[i]){
                s=prices[i];
            }
            else{
                res = Math.max(res,prices[i]-s);
            }
        }
        return res;
    }
}
