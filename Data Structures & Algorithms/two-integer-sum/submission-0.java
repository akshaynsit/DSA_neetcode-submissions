class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int [] res = new int[2];

        for (int i =0;i<n;i++){
            if(map.containsKey(nums[i])){
                res[1] = i ;
                res[0] = map.get(nums[i]);
                return res;
            }
            map.put(target-nums[i],i);
        }
        return res;
    }
}
