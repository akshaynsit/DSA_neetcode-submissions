class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>st = new Stack<>();
        int n = temperatures.length;
        int [] res = new int[n];
        //int p =0;
        Arrays.fill(res,0);
        for(int i= n-1;i>=0;i--){           
            while(!st.isEmpty() && st.peek()[0]<= temperatures[i]){
                
                res[i] = st.pop()[1]-i;
            }
            if(st.isEmpty()){
                res[i] = 0;
            }
            else if(!st.isEmpty() && st.peek()[0]> temperatures[i]){
                res[i] = st.peek()[1] -i;
            }
            // else{
            //     res[i] = Math.max(1,res[i]);
            // }
            //res=st.isEmpty()?1:(i-res)+1;
            st.push(new int[]{temperatures[i],i});
            
        }
        return res;

        
    }
}
