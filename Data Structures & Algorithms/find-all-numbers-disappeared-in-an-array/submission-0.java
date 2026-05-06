class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n =nums.length;
        boolean [] res1 = new boolean[n];
        for(int i:nums){
            res1[i-1] = true;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(res1[i] == false){
                res.add(i+1);
            }
        }
        return res;
    }
}