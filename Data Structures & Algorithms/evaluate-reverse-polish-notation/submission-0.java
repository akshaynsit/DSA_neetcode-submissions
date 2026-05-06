class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int p;
        int q;
        for(String c :tokens){
            if(c.equals("+")){
               p = stack.pop();
               q = stack.pop(); 
               stack.push(p+q);
            }
            else if(c.equals("-")){
               p = stack.pop();
               q = stack.pop(); 
               stack.push(q-p);
            }            
            else if(c.equals("*")){
               p = stack.pop();
               q = stack.pop(); 
               stack.push(q*p);
            }
            else if(c.equals("/")){
               p = stack.pop();
               q = stack.pop(); 
               stack.push(q/p);
            }

           else{
                stack.push(Integer.parseInt(c)); 
           } 
           
        }
        p = stack.pop();
        return p;
    }
}
