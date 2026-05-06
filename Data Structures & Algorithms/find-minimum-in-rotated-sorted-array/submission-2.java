class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l =0;
        int r = n-1;
        int mid= 0;
        while(l<r){
            mid = l+(r-l)/2;
            if(nums[mid]< nums[r])r=mid;
            else{
                l=mid+1;
            }
        }
        return nums[l];
    }
}
