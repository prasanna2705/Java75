class Solution {
    public int compress(char[] chars) {
        int ans = 0; // Pointer to store the result index
        
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i]; // Current character to compress
            int count = 0;
            
            // Count how many times the current character repeats consecutively
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            // Place the character in the result array
            chars[ans++] = letter;

            // If character repeats more than once, convert the count to characters
            if (count > 1) {
                // Convert count to a character array and store each digit
                for (final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        // Return the length of the compressed array
        return ans;
    }
}
