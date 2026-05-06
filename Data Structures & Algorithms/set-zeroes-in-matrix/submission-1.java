class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int fr = -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j] ==0 && i==0){
                    fr=0;
                    matrix[0][j] =0;
                }
                else if(matrix[i][j] ==0){
                    matrix[0][j] =0;
                    matrix[i][0] =0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j] ==0 || matrix[i][0] == 0){
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0] ==0){
            for(int i=0;i<n;i++){
                matrix[i][0] =0;
            } 
        }
        if(fr==0){
            for(int j=0;j<m;j++){
                matrix[0][j] =0;
            }
        }
        return matrix;

    }
}
