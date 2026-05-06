class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int gs= nums[0];
        int ls =nums[0];
        for(int i=1;i<n;i++){
            ls = Math.max(nums[i],ls+nums[i]);
            gs = Math.max(gs,ls);
            //System.out.println(ls);
            if(ls<0) ls=0;
            
        }
        return gs;


    }
}
