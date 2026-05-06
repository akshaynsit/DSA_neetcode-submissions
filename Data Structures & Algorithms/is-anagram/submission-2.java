class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        int[] checks = new int[26];
        for(int i =0;i <n;i++){
            checks[s.charAt(i) -'a']++;
            checks[t.charAt(i) -'a']--;
        }
        for(int n1:checks){
            if(n1 !=0) return false;
        }
        return true;
    }
}
