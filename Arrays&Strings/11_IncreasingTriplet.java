class Solution {
    public boolean increasingTriplet(int[] nums) {
        // min1 -> smallest number found so far
        // min2 -> second smallest number found so far that is greater than min1
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        // Iterate through all numbers in the array
        for (int n : nums) {
            if (n <= min1) {
                // Found a new smallest number
                min1 = n;
            } else if (n <= min2) {
                // Found a number greater than min1 but smaller than current min2
                min2 = n;
            } else {
                // Found a number greater than both min1 and min2
                // This means we have min1 < min2 < n => increasing triplet exists
                return true;
            }
        }
        // If loop ends without finding such a triplet, return false
        return false;
    }
}
