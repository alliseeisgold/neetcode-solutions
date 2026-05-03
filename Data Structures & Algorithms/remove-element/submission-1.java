// approach:
// 1. brute force: TC: O(n^2), SC: O(1), n = len(nums)
// 2. two pointers: TC: O(n), SC: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1;
        while (k > 0 && nums[k] == val) {
            k--;
        }
        if (k == 0) {
            return k;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (k < i) {
                break;
            }
            
            if (nums[i] != val) {
                continue;
            }

            // swap
            nums[i] = nums[k];
            nums[k] = val;
            while (k > 0 && nums[k] == val) {
                k--;
            }
        }
        return k + 1;
    }
}

//        k  i     
// [4, 3, 2, 1, 1]