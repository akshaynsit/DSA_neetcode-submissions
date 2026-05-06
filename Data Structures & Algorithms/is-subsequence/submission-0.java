class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        int ss =0;
        int ts =0;
        while(ss<s1 && ts<t1){
            if(s.charAt(ss)==t.charAt(ts)){
                ss++;
                ts++;
            }
            else{
                ts++;
            }
        }
        if (ss>=s1) return true;
        return false;
    }
}