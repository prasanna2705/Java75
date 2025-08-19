class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Iterate through each plot in the flowerbed
for (int i = 0; i < flowerbed.length; i++) {
    
    // Check if the left side is empty (or it's the first plot)
    boolean left = i == 0 || flowerbed[i - 1] == 0;
    
    // Check if the right side is empty (or it's the last plot)
    boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
    
    // If the current plot is empty AND both sides are empty,
    // then we can plant a flower here
    if (left && right && flowerbed[i] == 0) {
        flowerbed[i] = 1; // Plant the flower
        n--;              // Reduce the number of flowers to be planted
    }
}

// If all required flowers are planted, return true
// Otherwise, return false
return n <= 0;
 
    }
}