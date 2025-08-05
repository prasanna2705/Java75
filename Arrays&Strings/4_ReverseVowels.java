class Solution {
    public String reverseVowels(String s) {
        // Define a string containing all vowels (both uppercase and lowercase)
        String vowels = "AEIOUaeiou";

        // Convert the input string to a character array for easy modification
        char s1[] = s.toCharArray();

        // Initialize two pointers: one from the start and one from the end
        int p1 = 0, p2 = s.length() - 1;

        // Loop until the two pointers meet
        while (p1 < p2) {
            // Move p1 forward until it points to a vowel or crosses p2
            while (p1 < p2 && vowels.indexOf(s1[p1]) == -1) {
                p1++;
            }

            // Move p2 backward until it points to a vowel or crosses p1
            while (p1 < p2 && vowels.indexOf(s1[p2]) == -1) {
                p2--;
            }

            // Swap the vowels at p1 and p2
            char temp = s1[p1];
            s1[p1] = s1[p2];
            s1[p2] = temp;

            // Move both pointers inward
            p1++;
            p2--;
        }

        // Convert the modified character array back to a string and return it
        return new String(s1);
    }
}
