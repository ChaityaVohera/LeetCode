class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestLength = 0;
        Map <Integer , Boolean> hmap = new HashMap<>();
        
        for(int num : nums)
            hmap.put(num , Boolean.FALSE);
        
        for(int num : nums){
            int currentLength = 1;
            
            int nextNo = num + 1;
            
            while(hmap.containsKey(nextNo) && hmap.get(nextNo) == false){
                currentLength++;
                hmap.put(nextNo , Boolean.TRUE);
                nextNo++;
            }
            int prevNo = num - 1;
            while(hmap.containsKey(prevNo) && hmap.get(prevNo) == false){
                currentLength++;
                hmap.put(prevNo , Boolean.TRUE);
                prevNo--;
            }
            longestLength = Math.max(longestLength , currentLength);
        }
        return longestLength;
    }
}