class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l =0;
        int r =n-1;
        int mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]<nums[(mid-1+n)%n] && nums[mid]<nums[(mid+1)%n]){
                return nums[mid];
            }
            else if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return nums[mid];
        
    }
}
