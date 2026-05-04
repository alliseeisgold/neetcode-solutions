class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            count += (nums[i] == majority) ? 1 : -1;
        }
        return majority;
    }
}

// [1] -> 1
// [5, 5, 2, 5, 1, 1, 1, 5, 5] -> 5
// [1, 5, 1, 2, 5, 2, 5, 5, 5] -> 5