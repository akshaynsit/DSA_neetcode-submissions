class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int s =0;
        int e = n-1;
        int p;
        int []res = new int[2];
        while(s<e){
            p = numbers[s]+numbers[e];
            if(p==target){
                res[0] = s+1;
                res[1] = e+1;
                return res;
            }
            else if(target > p)s++;
            else{
                e--;
            }
        }
        return new int[0];
    }
}
