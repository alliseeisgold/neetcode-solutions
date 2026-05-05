class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> isAppeared = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right - left > k) {
                isAppeared.remove(nums[left]);
                left++;
            }
            if (!isAppeared.add(nums[right])) {
                return true;
            }
        }
        return false;
    }
}