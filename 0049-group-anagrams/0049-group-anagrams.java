class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String , List<String>> hmap = new HashMap<>();
        
        for(int i = 0 ; i < strs.length ; i++){
            String s = strs[i];
            
            int[] charCount = new int[26];
            
            for(int j = 0 ; j < s.length() ; j++){
                charCount[s.charAt(j) - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int k = 0 ; k < charCount.length ; k++){
                sb.append('#');
                sb.append(charCount[k]);
            }
            
            String key = sb.toString();
            
            if(!hmap.containsKey(key)){
                hmap.put(key , new ArrayList<>());
            }
            hmap.get(key).add(s);
        }
        return new ArrayList<>(hmap.values());
    }
}