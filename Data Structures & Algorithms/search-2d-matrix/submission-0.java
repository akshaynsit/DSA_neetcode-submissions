class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rs = 0;
        int re = n-1;   
        int cs =0;
        int ce = m-1;     
        int mid =0;
        int midc = 0;
        //find row
        while(rs<=re){
            mid = (rs + (re-rs)/2);            
            if ((matrix[mid][0] == target) || matrix[mid][ce] == target){
                return true;
            }
            else if((matrix[mid][0] > target) && (matrix[mid][ce] > target)){
                re=mid-1;
            }
            else if((matrix[mid][0] < target) && (matrix[mid][ce] <target)){
                rs =mid +1;
            }
            else{
               break;
            }
        }

        //find Column
        while(cs<=ce){
            midc = (cs + (ce-cs)/2);            
            if ((matrix[mid][midc] == target)){
                return true;
            }
            else if((matrix[mid][midc] > target)){
                ce=midc-1;
            }
            else{
                cs=midc+1;
            }
            
        }
        
        return false;

    }
}
