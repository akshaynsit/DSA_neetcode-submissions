class Solution {
    public int findDuplicate(int[] nums) {
        int n =nums.length;
        //int i= 1;
        
        for(int i=1;i<=n;i++){
            int p = Math.abs(nums[i-1]);
            if(nums[p-1]<0) return p;
            nums[p-1] = -nums[p-1];
            //i++;
        }
        return -1;
    }
}
