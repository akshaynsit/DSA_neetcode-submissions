class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n =nums.length;
        int sum = 0;
        for (int num : nums) sum += num;
        int s1 = (sum + target)/2;
         // If (sum + target) is odd or negative, no solution
        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) return 0;
        int []dp = new int[s1+1];
        dp[0] = 1;
        for(int i=0;i<n;i++){
            int val = nums[i];
            for(int j = s1;j>=val;j--){
                dp[j] +=dp[j-val];
            }
        }
        return dp[s1];


    }
}
