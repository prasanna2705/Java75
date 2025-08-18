class Solution {
    public int maxArea(int[] height) {
      // Initialize maxArea to store the maximum water container area
int maxArea = 0;

// Two pointers: left starts from the beginning, right from the end
int left = 0;
int right = height.length - 1;

// Loop until the two pointers meet
while (left < right) {
    // Calculate the area formed between left and right boundaries
    // Width = (right - left), Height = minimum of two lines
    maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

    // Move the pointer pointing to the smaller height
    // This may increase the chance of finding a larger container
    if (height[left] < height[right]) {
        left++;
    } else {
        right--;
    }
}

// Return the maximum area found
return maxArea;
   
    }
}