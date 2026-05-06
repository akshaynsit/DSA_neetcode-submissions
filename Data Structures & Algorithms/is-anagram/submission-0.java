class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n !=m) return false;
        int [] character = new int[26];
        for(int i=0;i<n;i++){
            character[s.charAt(i) - 'a']++;
            character[t.charAt(i) - 'a']--;
        }
        for (int i : character) if (i != 0) return false;
        return true;
    }
}
