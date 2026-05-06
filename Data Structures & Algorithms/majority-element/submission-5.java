class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int c =1;
        int i1 =nums[0];

        for(int i=1;i<n;i++){
            if(nums[i] == i1)c+=1;

            else if ((nums[i] != i1) && c<=0) {
                i1=nums[i];
                c+=1;
            }
            else{
                c-=1;
            }
        }
        return i1;
    }
}