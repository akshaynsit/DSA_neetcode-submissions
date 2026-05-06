class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int doubleval =0;
        int missing =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    doubleval = grid[i][j];
                    //break;
                }
                set.add(grid[i][j]);
            }
        }
        //for missing
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }


        return new int[]{doubleval, missing};
    }
}