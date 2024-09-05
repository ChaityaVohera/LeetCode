class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        
        Stack <Integer> helperStack = new Stack<>();
        
        for(int idx = temperatures.length - 1 ; idx > -1 ; idx--) {
            
            while(!helperStack.isEmpty() && temperatures[idx] >= temperatures[helperStack.peek()]) {
                helperStack.pop();
            }
            
            if(!helperStack.isEmpty()) {
                result[idx] = helperStack.peek() - idx;
            }
            
            helperStack.push(idx);
        }
        return result;
    }
}