class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       int lm = nums[0];
       int gm = nums[0];
       for(int i=1;i<n;i++){
        lm = Math.max(lm+nums[i],nums[i]);
        if(lm>gm)gm= lm;
       }
       return gm;


    }
}
