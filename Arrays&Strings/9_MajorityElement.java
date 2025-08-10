public class Solution {
    /*
     * Finds the majority element in the given array
     * Majority element is the element that appears more than n/2 times in the array.
     */
    public int majorityElement(final int[] A) {
        int max = -1;   // Candidate for majority element
        int count = 0;  // Counter to track candidate's frequency
        // Iterate through all elements in the array
        for (int i = 0; i < A.length; i++) {
            // If count is zero, pick current element as new candidate
            if (count == 0) {
                max = A[i];
            }
            // If current element matches the candidate, increment count
            if (A[i] == max) {
                count++;
            } 
            // Otherwise, decrement count (vote against candidate)
            else {
                count--;
            }
        }
        // At the end, 'max' holds the majority element
        return max;
    }
}
