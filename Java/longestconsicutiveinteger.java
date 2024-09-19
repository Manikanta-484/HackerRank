/*Problem: Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. The consecutive numbers can be in any order, and duplicates are not counted.

Example:

Input:
nums = [100, 4, 200, 1, 3, 2]

Output:
4

Explanation:
The longest consecutive sequence is [1, 2, 3, 4].

Constraints:

Time complexity should be O(n). */
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        // Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the set
        for (int num : numSet) {
            // Only check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));  // Output: 4
    }
}