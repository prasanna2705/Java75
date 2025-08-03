class Solution {
    public String mergeAlternately(String s1, String s2) {
        // Converting two strings into character arrays
        char[] arr1 = s1.toCharArray(), arr2 = s2.toCharArray();
        int n = s1.length() + s2.length();git
        // Creating an extra array to hold the final merged characters
        char[] ans = new char[n];
        int i = 0, j = 0, k = 0;
        // Using two-pointer approach to merge both character arrays alternately
        while (i < arr1.length && j < arr2.length) {
            ans[k++] = arr1[i++];
            ans[k++] = arr2[j++];
        }
        // Append remaining characters if any
        while (i < arr1.length) ans[k++] = arr1[i++];
        while (j < arr2.length) ans[k++] = arr2[j++];

        // Return the merged character array as a string
        return new String(ans);
    }
}
