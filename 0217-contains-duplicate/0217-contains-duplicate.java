class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for (int i : nums) {
            if (hset.contains(i)) {
                return true;
            }
            hset.add(i);
        }
        return false;
    }
}


// https://youtu.be/0LIctkgJ2hQ