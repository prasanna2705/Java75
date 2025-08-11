class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {

            // Case 1: Current digit is less than 9
            // Just increment it and return the array (no carry needed)
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Early exit because no further changes are required
            }

            // Case 2: Current digit is 9
            // Set it to 0 and carry the 1 to the next digit (to the left)
            digits[i] = 0;
        }

        // If we are here, it means all digits were 9 (e.g., 999 -> 1000)
        // We need a new array with an extra digit for the carry
        int[] result = new int[digits.length + 1];
        result[0] = 1; // The carry becomes the new most significant digit
        return result;
    }
}
