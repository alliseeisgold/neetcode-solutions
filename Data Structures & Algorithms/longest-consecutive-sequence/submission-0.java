// approach:
// 1. brute force: 
// we iterate through array and fix current element as the beginning of the array 
// and then count the longest subsequence that starts with this element
// TC: O(n^2), SC: O(1)

// 2. optimal (using hashset)
// instead of forming a sequence for every number we should only consider a number 
// num as the start of a sequence if and only if num - 1 doesn't exist in our array. 
// we iterate through the array and only start building the sequence if it is the start
// of a sequence. We can use a hashset for O(1) lookups by converting the array to a hashset
// TC: O(n), SC: O(n)

// [2, 20, 4, 10, 3, 4, 5, 1]

// set: [2, 3, 4, 1, 5, 10, 20]

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            unique.add(nums[i]);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (unique.contains(nums[i] - 1)) {
                continue;
            }
            int len = 0;
            int start = nums[i];
            while (unique.contains(start)) {
                start++;
                len++;
            }
            result = Math.max(result, len);
        }
        return result;
    }
}
