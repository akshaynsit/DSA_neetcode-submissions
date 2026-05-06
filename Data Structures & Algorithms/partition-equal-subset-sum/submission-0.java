class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        boolean[][] temp = new boolean[n+1][(sum/2)+1];
        for(int i=0;i<n;i++){
            temp[i][0] =true;
        }
        for(int i =1;i<n+1;i++){
            for(int j =1;j<=(sum/2);j++){
                if(nums[i-1]<=j){
                    temp[i][j] = (temp[i-1][j] || temp[i-1][j-nums[i-1]]);
                }
                else{
                    temp[i][j] = temp[i-1][j];
                }
            }
        }
        return temp[n][(sum/2)];
    }
}
