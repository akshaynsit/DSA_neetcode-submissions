class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> p = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(p.contains(nums[i])) return true;
            p.add(nums[i]);
        }
        return false;
    }
}
