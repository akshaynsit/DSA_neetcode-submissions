class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int []f= new int[n];
        int []b = new int[n];

        f[0] =1;
        b[n-1] = 1;
        for(int i=1;i<n;i++){
            f[i] = f[i-1]*nums[i-1];            
        }
        for(int i=n-2;i>=0;i--){
            b[i] = b[i+1]*nums[i+1];            
        }
        for(int i=0;i<n;i++){
            //System.out.println(f[i] + "    " + b[i]);
            
            b[i] = f[i]*b[i];
        }
        //b[n-1] = f[n-2];
        //b[0] = b[1];
        return b;

    }
}  
