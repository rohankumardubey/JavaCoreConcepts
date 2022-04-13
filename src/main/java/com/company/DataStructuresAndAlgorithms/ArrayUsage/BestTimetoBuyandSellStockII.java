package com.company.DataStructuresAndAlgorithms.ArrayUsage;

//Input: prices = [7,1,5,3,6,4]
//        Output: 7
//        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//        Total profit is 4 + 3 = 7.


public class BestTimetoBuyandSellStockII {
    public static int nonOptimisedmaxProfit(int[] arr) {
        int left = 1;
        int profit = 0;
        while (left < arr.length) {
            if (arr[left] > arr[left - 1]) {
                profit = profit + (arr[left] - arr[left - 1]);
            }
            left++;
        }
        return profit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 7, 4};
        System.out.println(nonOptimisedmaxProfit(arr));
    }
}
