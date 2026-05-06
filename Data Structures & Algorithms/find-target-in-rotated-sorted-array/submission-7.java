class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l =0;
        int r =n-1;
        int mid = 0;
        int minIndex =0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]<nums[(mid-1+n)%n] && nums[mid]<nums[(mid+1)%n]){
                minIndex = mid;
                break;
            }
            else if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        l=0;
        r=n-1;
        if(target==nums[minIndex]) return minIndex;
        if(target>nums[minIndex] && target<=nums[r]) l=minIndex+1;
        else r=minIndex-1;
        System.out.print(minIndex + " "+ l +" " +r );
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }

        return -1;

    }
}
