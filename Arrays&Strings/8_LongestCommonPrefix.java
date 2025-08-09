import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the input array is empty, return empty string
        if (strs.length == 0) return "";

        // Step 1: Sort the array of strings lexicographically
        // After sorting, the strings with the smallest and largest differences
        // will be at the beginning and end of the array.
        Arrays.sort(strs);

        // Step 2: Retrieve the first and last strings in sorted order
        // The Longest Common Prefix(LCP) of these two strings will be the Longest Common Prefix (LCP) of the entire array
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Step 3: Compare characters between first and last strings
        // Continue until characters differ or we reach the end of one string
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Step 4: The common prefix is the substring from 0 to i of the first string
        return first.substring(0, i);
    }
}
