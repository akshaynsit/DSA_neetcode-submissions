class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer>res = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     nums[nums[i]-1] = -Math.abs(nums[nums[i]-1]);
        // }
        for(int num:nums){
            int i = Math.abs(num)-1;
            nums[i]= -Math.abs(nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i] >0)res.add(i+1);
        }
        return res;
    }
}