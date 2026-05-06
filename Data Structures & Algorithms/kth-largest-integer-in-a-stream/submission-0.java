class KthLargest {
    private PriorityQueue<Integer> q;
    private int K;
    public KthLargest(int k, int[] nums) {
        this.K=k;
        this.q = new PriorityQueue<>();
        for(int p:nums){
            q.offer(p);
            if(q.size() > K){
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size() > K){
            q.poll();
        }
        return q.peek();
    }
}
