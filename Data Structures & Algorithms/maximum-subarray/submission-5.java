class Solution {
    public int maxSubArray(int[] nums) {        
        int n = nums.length;
        int sum1 =Integer.MIN_VALUE;
        int cursum =0;
        for(int i=0;i<n;i++){
            cursum = Math.max(cursum+nums[i],nums[i]);
            if(cursum>sum1)sum1=cursum;
        }
        return sum1;
    }
}
