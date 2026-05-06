class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> q
        = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());
        int n = nums.length;
        for(int i =0;i<n;i++){
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
        }
        //System.out.println(map1);
        
        //Keep heap size <= k
        for(Map.Entry<Integer,Integer>entry:map1.entrySet()){
            q.offer(entry);
            if(q.size()>k){
                //System.out.println(q);
                q.poll();
            }
            
        }
        //System.out.println(q);
        //Extract results
        int[] result = new int[k];
        int i = 0;
        while (!q.isEmpty()) {
            result[i++] = q.poll().getKey();
        }
        
        return result;
    }      
}
