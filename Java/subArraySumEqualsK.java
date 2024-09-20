/* Problem: Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example:

Input:
nums = [1, 1, 1], k = 2

Output:
2

Explanation:
There are two subarrays that sum to 2:

[1, 1] (starting from index 0)

[1, 1] (starting from index 1)


Constraints:

The length of the array nums is between 1 and 20,000.

The values of nums[i] will be between -1000 and 1000.

The value of k will be between -10^7 and 10^7. */


import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        // Map to store (cumulative sum, number of occurrences)
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // To handle cases where subarray starts from index 0
        
        int cumulativeSum = 0;
        int count = 0;
        
        for (int num : nums) {
            cumulativeSum += num;
            
            // Check if (cumulativeSum - k) exists in the map
            if (sumMap.containsKey(cumulativeSum - k)) {
                count += sumMap.get(cumulativeSum - k);
            }
            
            // Update the map with the current cumulative sum
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println("Number of Subarrays: " + subarraySum(nums, k));  // Output: 2
    }
}