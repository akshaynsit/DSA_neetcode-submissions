class Solution {
    public boolean isValid(String s) {
      if (s.length() %2 !=0) return false;
      Stack<Character> st = new Stack<>();
      for(char c :s.toCharArray()){
        System.out.println(st);        
        if(st.isEmpty() && (c==')'|| c=='}' || c==']'))return false;        
        if(!st.isEmpty()){
           if (st.peek() == '(' && c == ')') st.pop();
            else if(c==']' && st.peek() =='[') st.pop();
            else if(c=='}' && st.peek() =='{') st.pop();
            else st.push(c);
        }    
               
        else {st.push(c);}
      }
      
      return st.isEmpty();  
    }
}
