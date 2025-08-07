class Solution {
    public int[] productExceptSelf(int[] nums) {
        //✅Approach 1:Nested Loop (Brute-force - Exclude Self and Multiply Others)
        // This is the most straightforward solution to the problem.
        // It works by iterating through the array and, for each index `i`,
        // computing the product of all elements in the array except nums[i].
        // 
        // ⚠️ However, this approach gives a Time Limit Exceeded error (TLE) 
        // for large input sizes because it uses nested loops.
        // 
        // ⏱️ Time Complexity: O(n²)
        // 🧠 Space Complexity: O(1) (excluding output array)

      
       // ✅ Approach 2: Using Prefix and Suffix Product Arrays
       // ⏱️ Time Complexity: O(n)
       // 🧠 Space Complexity: O(n) (for prefix and suffix arrays)
        // Arrays to store the prefix and suffix products
        int n = nums.length;
        int prefixpro[] = new int[n];
        int suffixpro[] = new int[n];
        int ans[] = new int[n]; // Final result array

        // Initialize the first element of prefix product as 1,
        // because there are no elements to the left of the first element
        prefixpro[0] = 1;

        // Initialize the last element of suffix product as 1,
        // because there are no elements to the right of the last element
        suffixpro[n - 1] = 1;

        // Calculate prefix product for each index
        // prefixpro[i] stores product of all elements to the left of index i
        for (int i = 1; i < n; i++) {
            prefixpro[i] = prefixpro[i - 1] * nums[i - 1];
        }

        // Calculate suffix product for each index
        // suffixpro[i] stores product of all elements to the right of index i
        for (int i = n - 2; i >= 0; i--) {
            suffixpro[i] = suffixpro[i + 1] * nums[i + 1];
        }

        // Multiply prefix and suffix products to get the final answer
        // For each index i, ans[i] = product of all elements except nums[i]
        for (int i = 0; i < n; i++) {
            ans[i] = prefixpro[i] * suffixpro[i];
        }

        return ans;
    }
}
