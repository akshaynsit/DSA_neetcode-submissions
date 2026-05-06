class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> m=new HashMap<>();
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for (int i=0;i<nums.length;i++)
        {
             m.put(nums[i],m.getOrDefault(nums[i],0)+1);

        }

Iterator<Map.Entry<Integer, Integer>> iterator = m.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, Integer> entry = iterator.next();
      q.offer( new int[]{entry.getValue(),entry.getKey()});
    if(q.size()>k)
    q.poll();
       
  
}
 int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll()[1];
        }
        return res;
    }
}
