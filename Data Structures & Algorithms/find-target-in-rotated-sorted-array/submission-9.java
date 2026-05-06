class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        //int res =-1;
        int l=0;
        int r= n-1;
        int mid=0;
        while(l<r){
            mid = l+(r-l)/2;
            //if(nums[mid] ==target) return mid;

            if(nums[mid] <nums[r]){
                r=mid;
            } 
            else{
                l=mid+1;
            }

        }
        //return l;
        int lowest = l;
        //2 sorted array now 0 to l-1 && l to n-1;

        l=0;
        r= lowest-1;
        while(l<=r){
            mid =l+(r-l)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) r= mid-1;
            else{
                l=mid+1;
            }

        }
        l=lowest;
        r = n-1;
        while(l<=r){
            mid =l+(r-l)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) r= mid-1;
            else{
                l=mid+1;
            }

        }
        return -1;

    }
}
