class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int number = nums[0];
        int count =1;
        for(int i=1;i<n;i++){
            if(count == 0){
                number = nums[i];
                count+=1;
            }
            else if(nums[i]==number){
                count+=1;
            }
            else{
                count -=1 ;             
            }
            
            
        }
        return number;
    }
}