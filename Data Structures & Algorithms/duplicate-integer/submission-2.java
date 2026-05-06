class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set1.contains(nums[i])) return true;
            set1.add(nums[i]);
        }
        return false;
    }
}
