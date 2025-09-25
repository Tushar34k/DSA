package org.example.leetcode;

/**
 * Problem: Best Time to Buy and Sell Stock (LeetCode 121)
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity: O(n)  // Single pass through prices
 * Space Complexity: O(1) // Constant extra space
 */

public class BestTimeToBuyAndSellStock {

    /**
     * Calculates the maximum profit achievable from buying and selling stock.
     *
     * @param prices array of stock prices where prices[i] is the price on day i
     * @return maximum profit possible
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Tracks the minimum price so far
        int maxProfit = 0;                // Tracks the maximum profit found

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update min price if current is lower
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Calculate max profit
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 5
    }
}

