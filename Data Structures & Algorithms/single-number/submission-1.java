class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int p = nums[0];
        for(int i=1;i<n;i++){
            p ^= nums[i]; 
        }
        return p;
    }
}
