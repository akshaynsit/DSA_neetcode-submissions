class Solution {
    public int[] twoSum(int[] a, int target) {
int i=0; 
int j=a.length-1;
while(i<j)
{
    if(a[i]+a[j]==target)return new int[]{i+1,j+1};
    else if (a[i]+a[j]>target)
    j--;
    else{
        i++;
    }

}
return new int[]{};

}
}
