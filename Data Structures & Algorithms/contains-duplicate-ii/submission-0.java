class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Boolean> isAppeared = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (isAppeared.getOrDefault(nums[i], false)) {
                return true;
            }
            isAppeared.put(nums[i], true);
        }
        for (int i = k; i < nums.length; i++) {
            if (isAppeared.getOrDefault(nums[i], false)) {
                return true;
            }
            isAppeared.put(nums[i - k], false);
            isAppeared.put(nums[i], true);
        }
        return false;
    }
}