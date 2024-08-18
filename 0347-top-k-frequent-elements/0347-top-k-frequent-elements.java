class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map <Integer , Integer> hmap = new HashMap<>();
        
        for(int num : nums) {
            hmap.put(num , hmap.getOrDefault(num , 0) + 1);
        }
        
        List <Integer>[] bucket = new List[nums.length + 1];
        
        for(int key : hmap.keySet()) {
            int frequency = hmap.get(key);
                if(bucket[frequency] == null) {
                    bucket[frequency] = new ArrayList<>();
                }
            bucket[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int pos = bucket.length - 1;pos >= 0 && topK.size() < k; pos--) {
            if (bucket[pos] != null) {
            topK.addAll(bucket[pos]);
        }
    }
    return topK.stream().mapToInt(i -> i).toArray();
    }
}