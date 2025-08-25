class Solution {
    public String decodeString(String s) {
           // Initialize two stacks: one for numbers (repeat counts) and another for string builders (intermediate strings)
Stack<Integer> st = new Stack<>();
Stack<StringBuilder> st1 = new Stack<>();

// Current string builder and number accumulator
StringBuilder sb = new StringBuilder();
int n = 0;

// Iterate through each character in the input string
for (char c : s.toCharArray()) {
    if (Character.isDigit(c)) {
        // Build the number (could be multiple digits, e.g., "12")
        n = n * 10 + (c - '0');
    } else if (c == '[') {
        // Push the current number and string state into stacks
        st.push(n);
        n = 0;
        st1.push(sb);
        sb = new StringBuilder(); // Start fresh for the new substring
    } else if (c == ']') {
        // Pop the repeat count and the previous string
        int k = st.pop();
        StringBuilder temp = sb;  // The string to repeat
        sb = st1.pop();           // Restore the previous string
        // Append the repeated substring 'k' times
        while (k-- > 0) {
            sb.append(temp);
        }
    } else {
        // Append regular characters
        sb.append(c);
    }
}

// Return the fully decoded string
return sb.toString();

    }
}