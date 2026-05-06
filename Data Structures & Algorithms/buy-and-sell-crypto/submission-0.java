class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max =0;
        int min = prices[0];
        for(int i =1;i<n;i++){
            
            int cur = prices[i];
            if(cur > min){
                max = Math.max(max,cur-min);
            }
            else{
                min = Math.min(min,cur);
            }
        }
        return max;
        
    }
}
