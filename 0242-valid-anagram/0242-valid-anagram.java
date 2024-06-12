class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!= t.length())
            return false;
        
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // Compare sorted arrays to check if they are equal
        return Arrays.equals(sArray, tArray);
    }
}   

// https://www.youtube.com/watch?v=wKF6L9Zo8PQ