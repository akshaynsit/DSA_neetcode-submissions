class MinStack {
    private Stack<Long> st;
    long min;

    //Using 1 stack
    public MinStack() {
        st =new Stack<>();       
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min =val;
        }
        else if(min<=val){
            st.push((long)val);
        }
        else{
            st.push(2L *val - min);
            min= val;
        }

        
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        if(min<=st.peek()){
            st.pop();
            
        }
        else{
            min = 2L*min-st.peek();
            st.pop();
        }
        return;
        
    }
    
    public int top() {
        long top = st.peek();
        if(top>min){
            return (int)top;
        }
        else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
