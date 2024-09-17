class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxLength = 0;
        int charFreq = 0;
        int[] charCount = new int[26];
        
        for(int end = 0 ; end < s.length() ; end++) {
            charCount[s.charAt(end) - 'A']++;
            
        charFreq = Math.max(charFreq , charCount[s.charAt(end) - 'A']);
            
            int wordLength = end - start + 1;
            
            if(wordLength - charFreq > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
                wordLength = end - start + 1;
            }
            maxLength = Math.max(maxLength , wordLength);
        }
        return maxLength;
    }
}