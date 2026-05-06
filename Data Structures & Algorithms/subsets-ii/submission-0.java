class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      Set<List<Integer>> res = new HashSet<>();
      Arrays.sort(nums);
      List<Integer> subset = new ArrayList<>();
      subsets(nums,0,subset,res);
      return new ArrayList<> (res);
    }
    private void subsets(int[]nums,int start,List<Integer> subset,Set<List<Integer>> res){
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
