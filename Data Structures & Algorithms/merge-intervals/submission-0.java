class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;   
        //first sort by first column     
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<n;i++){
            int first  = intervals[i][0];
            int last = intervals[i][1];
            int inserted = res.get(res.size()-1)[1];
            if(first<=inserted){
                res.get(res.size()-1)[1] =  Math.max(inserted,last);
            }
            else{
                res.add(new int[]{first,last});
            }
        }
        return res.toArray(new int[res.size()][]);

        

    }
}
