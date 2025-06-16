import java.util.Arrays;

/**
 * Program: Find Median of an Array
 * Author: Tushar Kokane
 * Date: 2025-05-01
 *
 * Time Complexity: O(n log n) – due to sorting
 * Space Complexity: O(1) – in-place sorting
 */

public class FindMedian {

    public static double findMedian(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int n = nums.length;

        if (n % 2 != 0) {
            // Odd number of elements → return middle
            return nums[n / 2];
        } else {
            // Even number of elements → average of two middles
            return (nums[(n / 2) - 1] + nums[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 2};
        int[] nums2 = {7, 1, 3};

        System.out.println("Median of nums1: " + findMedian(nums1));  // Output: 2.5
        System.out.println("Median of nums2: " + findMedian(nums2));  // Output: 3.0
    }
}
