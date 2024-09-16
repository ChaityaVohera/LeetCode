class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int maxLength = 0;
        
        HashSet<Character> hset = new HashSet<>();
        
        for(int end = 0 ; end < s.length() ; end++) {
            char currentChar = s.charAt(end);
            
            while (hset.contains(currentChar)) {
                hset.remove(s.charAt(start));
                start++;
            }
            hset.add(currentChar);
            maxLength = Math.max(maxLength , end - start + 1);
        }
        return maxLength;
    }
}