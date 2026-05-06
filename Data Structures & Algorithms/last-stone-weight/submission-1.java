class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s: stones){
            minHeap.offer(-s);
        }
        while(minHeap.size()>1){
            int f = minHeap.poll();
            int s = minHeap.poll();
            int final1 = f-s;
            if (final1 !=0){
                minHeap.offer(final1);
            }
        }
        return (minHeap.isEmpty()? 0:-minHeap.poll());
    }
}
