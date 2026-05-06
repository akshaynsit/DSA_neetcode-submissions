class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int z= 0;
        int t =n-1;
        int i =0;
        while(i<=t){
            if(nums[i] ==0){
                int temp = nums[z];
                nums[z]=nums[i];
                nums[i] = temp;
                z++;
            }
            else if(nums[i]==2){
                int temp = nums[t];
                nums[t]=nums[i];
                nums[i] = temp;
                t--;
                i--;
            }
            i++;

        }
        
    }
}