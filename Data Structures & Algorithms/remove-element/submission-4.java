// approach:
// 1. brute force: TC: O(n^2), SC: O(1), n = len(nums)
// 2. two pointers: TC: O(n), SC: O(1)
// as we don't consider elements beyond the first k we can move by one
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                nums[k++] = num;
            }
        }
        return k;
    }
}

//        k  i     
// [4, 3, 2, 1, 1]