class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer 'l' keeps track of the position to place the next non-zero element
        int l = 0;

        // Traverse the array with pointer 'i'
        for (int i = 0; i < nums.length; i++) {
            
            // If current element is non-zero, swap it with the element at 'l'
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;

                // Increment 'l' to point to the next position for non-zero placement
                l++;
            }
        }
        // After this loop:
        //  - All non-zero elements are shifted to the front
        //  - All zeroes are pushed to the end
        //  - The relative order of non-zero elements is preserved
    }
}
