class KthLargest {
    private PriorityQueue<Integer> q;
     private int largest;
    public KthLargest(int k, int[] nums) {
        this.largest =k;
        this.q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
            if(q.size()>largest){
                q.poll();
            }
        }
        
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size()>largest){
            q.poll();
        }
        return q.peek();
    }
}
