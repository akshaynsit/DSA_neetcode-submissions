class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minst;

    //Using 2 stack
    public MinStack() {
        st =new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || minst.peek()>=val){
            minst.push(val);
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int val1 = st.pop();
        if(val1 ==minst.peek()){
            minst.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
