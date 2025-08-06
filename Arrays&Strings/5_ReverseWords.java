class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces, then split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: Push each word onto the stack
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word);
        }

        // Step 3: Pop from stack and build the reversed sentence
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}