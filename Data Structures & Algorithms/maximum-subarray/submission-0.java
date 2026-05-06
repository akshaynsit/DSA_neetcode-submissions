class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cur =0;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cur +=nums[i];
            if(cur > sum){
                sum = cur;
            }
            if(cur<0){
                cur=0;
            }
            

        }
        return sum;
    }
}
