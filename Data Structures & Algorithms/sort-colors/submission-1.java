class Solution {
    public void sortColors(int[] nums) {
        int[] counter = new int[3];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            while (counter[cur] == 0) {
                cur++;
            }
            nums[i] = cur;
            counter[cur]--;
        }
    }
}