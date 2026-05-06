class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m) return false;
        int [] char1 = new int[26];
        for(int i=0;i<n;i++){
            char1[s.charAt(i) -'a']++;
            char1[t.charAt(i)-'a']--;
        }
        for(int i:char1){
            if(i !=0)return false;
        }
        return true;
    }
}
