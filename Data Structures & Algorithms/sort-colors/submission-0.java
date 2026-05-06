class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int z=0;
        int t =n-1;
        int i =0;
        while(i<=t){
            if(nums[i] == 0){
                nums[i] =nums[z];
                nums[z] =0;
                z++;
            }
            else if(nums[i] == 2){
                nums[i] =nums[t];
                nums[t] =2;
                t--;
                i--;
            }
            i++;

        }
    }
}