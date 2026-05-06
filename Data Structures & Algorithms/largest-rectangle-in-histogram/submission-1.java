class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int []nsl = new int[n];
        int []nsr = new int[n]; 
        Stack<int[]>st = new Stack<>();

        //first find nsl
        for(int i=0;i<n;i++){
            nsl[i] = -1;
            while(!st.isEmpty() && st.peek()[0]>=heights[i]){
                 st.pop();
            }
            if(!st.isEmpty()){
                nsl[i] = st.peek()[1];
            }
            st.push(new int[]{heights[i],i});
        }
        
        st.clear();
        for(int i=n-1;i>=0;i--){
            nsr[i] = n;
            while(!st.isEmpty() && st.peek()[0]>=heights[i]){
                 st.pop();
            }
            if(!st.isEmpty()){
                nsr[i] = st.peek()[1];
            }
            st.push(new int[]{heights[i],i});
        }
        int res = 0;
        for(int i=0;i<n;i++){
            // nsl[i] +=1;
            // nsr[i] -=1;  
            res = Math.max(res,heights[i] * (nsr[i]-nsl[i] -1));
            //System.out.println(nsl[i]);
            //System.out.println(nsr[i]);
             
        }
        return res;


    }
}
