class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        
        int start = 0;
        
        if(s1.length() > s2.length())
            return false;
        
        for(int i = 0 ; i < s1.length() ; i++)
            s1Count[s1.charAt(i) - 'a']++;
        
        for(int end = 0 ; end < s2.length() ; end++) {
            windowCount[s2.charAt(end) - 'a']++;
            
            if(end - start + 1 > s1.length()) {
                windowCount[s2.charAt(start) - 'a']--;
                start++;
            }
            if(Arrays.equals(s1Count , windowCount))
                return true;
        }
        return false;
    }
}