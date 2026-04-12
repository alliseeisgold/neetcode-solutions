// [3, 4, 5, 6] target = 7
// 1) O(n^2)
// 2) O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int prev = target - nums[i];
            if (map.containsKey(prev)) {
                return new int[]{map.get(prev), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
