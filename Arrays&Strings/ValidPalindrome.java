class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string into a character array
        char s1[] = s.toCharArray();

        // Find the length of the character array
        int n = s1.length;

        // Take an extra array to store valid alphanumeric characters in lowercase
        char arr[] = new char[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            char c = s1[i];
            // Keep only alphanumeric characters and convert them to lowercase
            if (Character.isLetterOrDigit(c)) {
                arr[j++] = Character.toLowerCase(c);
            }
        }

        // Two-pointer approach to check if it's a valid palindrome
        int p1 = 0, p2 = j - 1;
        while (p1 < p2) {
            if (arr[p1] != arr[p2]) {
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }
}
