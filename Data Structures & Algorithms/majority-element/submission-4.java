class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int number = nums[0];
        int count =1;
        for(int i=1;i<n;i++){
            if(nums[i]==number){
                count+=1;
            }
            else if(count>0 && nums[i]!=number ){
                count -=1;
            }
            else if(count<1){
                count-=1;
                number = nums[i];
            }
        }
        return number;
    }
}