class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        if(n==0)return 0;
        int start = 0;
        int res =1;
        int r =0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                res = Math.max(res,(i-start));
                r =map.get(s.charAt(i)) +1;
                map.put(s.charAt(i),i);
                start = Math.max(start,r);
            }
            else{
                map.put(s.charAt(i),i);
                res = Math.max(res,(i-start)+1);
            }
            // System.out.println("char "+ s.charAt(i));           
            // System.out.println("start" + start);
            // System.out.println("res" + res);
        }
        return res;
    }
}
