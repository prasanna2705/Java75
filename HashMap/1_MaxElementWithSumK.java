class Solution {
    public int maxOperations(int[] nums, int k) {
        // HashMap to store the frequency of numbers we have seen but not yet paired
        Map<Integer, Integer> map = new HashMap<>();
        
        // Counter for total pairs formed
        int count = 0;
        
        // Iterate through each number in the array
        for (int num : nums) {
            // The number needed to form sum k with the current number
            int target = k - num;
            
            // If target exists in map and its count is > 0, we can form a pair
            if (map.getOrDefault(target, 0) > 0) {
                count++; // Found a valid pair
                // Decrease the frequency of target because it's now used
                map.put(target, map.get(target) - 1);
            } else {
                // Can't form a pair yet, so store current number for future pairing
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        // Return the total number of pairs formed
        return count; 
    }
}
