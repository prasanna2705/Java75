import java.util.Stack;

class Solution {
    public int reverse(int x) {
        // Check if the input number is negative
        boolean isNegative = x < 0;

        // Work with the absolute value of x for digit extraction
        x = Math.abs(x);
        
        // Stack to store the digits of x
        Stack<Integer> st = new Stack<>();
        
        // Extract digits from x and push onto the stack
        while (x > 0) {
            int rem = x % 10;  // Get the last digit
            st.push(rem);      // Push digit onto stack
            x = x / 10;        // Remove last digit from x
        }
        
        // Use a long variable for reversed number temporarily to detect overflow
        long reversed = 0;
        long place = 1;  // Multiplier to place digits correctly (ones, tens, hundreds, ...)
        
        // Pop digits from stack to reconstruct the reversed number
        while (!st.isEmpty()) {
            reversed += st.pop() * place;  // Add digit at the correct place value
            place *= 10;                   // Increase place value by factor of 10
            
            // Check if reversed number exceeds 32-bit signed integer maximum value
            if (reversed > Integer.MAX_VALUE) {
                return 0;  // Overflow detected, return 0
            }
        }
        
        // If original number was negative, convert reversed number back to negative
        if (isNegative) {
            reversed = -reversed;
        }
        
        // Check if the reversed number fits in 32-bit signed integer range
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;  // Out of bounds, return 0
        }
        
        // Cast to int and return the reversed number
        return (int) reversed;
    }
}
