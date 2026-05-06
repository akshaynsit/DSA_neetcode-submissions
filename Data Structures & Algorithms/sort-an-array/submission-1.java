class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        sort(nums,n);
        return nums;
    }

    private void sort(int []a1,int n1){
        if(n1<=1)return;
        int rem = a1[n1-1];
        sort(a1,n1-1);
        insert(a1,n1-1,rem);
    }
    private void insert(int[]a2,int n2,int ins){
        if(n2==0 || a2[n2-1]<= ins){
            a2[n2] = ins;
            return;
        }
        int rem1 = a2[n2-1];
        insert(a2,n2-1,ins);
        a2[n2] =rem1;

    }

}