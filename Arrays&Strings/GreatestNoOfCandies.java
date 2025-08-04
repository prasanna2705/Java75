import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maX = 0;

        // Step 1: Find the maximum number of candies any kid currently has
        for (int i : candies) {
            maX = Math.max(maX, i);
        }

        // Step 2: Create a list to store the result for each kid
        List<Boolean> ans = new ArrayList<>();

        // Step 3: For each kid, check if giving extraCandies makes their total >= max
        for (int i : candies) {
            int total = i + extraCandies;

            // Add true if this kid can have the greatest number of candies, else false
            ans.add(total >= maX);
        }

        return ans;
    }
}
