class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int cur = 0;
        for(int i=0;i<n;i++){
            cur +=nums[i];
            if(cur>res)res=cur;
            if(cur<0)cur=0;
        }
        return res;
    }
}
