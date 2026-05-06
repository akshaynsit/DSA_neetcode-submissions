class Solution {
    public int[] sortArray(int[] nums) {
        //using recurssion
        int n1 =nums.length;
        sort(nums,n1);
        return nums;
    }
    private void sort(int[] a,int n){
        if(n <=1) return ;
        int t = a[n-1];
        sort(a,n-1);
        insert(a,n-1,t);
    }
    private void insert(int[] a1,int e,int temp){
        if(e==0 || a1[e-1] <=temp){
            a1[e] = temp;
            return ;
        }
        int t1 = a1[e-1];
        insert(a1,e-1,temp);
        a1[e] = t1;

    }
}