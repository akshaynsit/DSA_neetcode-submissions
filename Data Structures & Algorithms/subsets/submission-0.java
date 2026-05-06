class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsets(nums,0,subset,res);
        return res;
    }
    private void subsets(int[]nums,int start,List<Integer> subset,List<List<Integer>> res){
        if(start >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[start]);
        subsets(nums,start+1,subset,res);
        //System.out.println ("last element" +subset.get(subset.size()-1));
        //System.out.println ("first element" +subset.get(0));
        subset.remove(subset.size()-1);
        subsets(nums,start+1,subset,res);

    }
}
