class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if(n==0)return 0;
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int []maxl = new int[n];
        int []maxr = new int[n];
        //Find max at left 
        // Fill maxLeft array
        maxl[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxl[i] = Math.max(height[i], maxl[i - 1]);
        }
        //Find max at right
        maxr[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            maxr[i] = Math.max(height[i], maxr[i + 1]);
        }         
        
        for(int i =0;i<n;i++){
            int height1 = Math.min(maxl[i],maxr[i]);
            res += height1-height[i];
        }
        return res;
        
    }
}
