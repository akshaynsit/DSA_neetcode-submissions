class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int p =0;
        for(int num:nums){
            if(count ==0){
                p = num;
                count+=1;
            }
            else if(count>0 && p==num){
                count+=1;
            }
            else{
                count -=1;
            }
        }
        return p ;
        
    }
}