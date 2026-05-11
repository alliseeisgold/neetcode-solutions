class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);

            if (counter.size() > 2) {
                Map<Integer, Integer> newCounter = new HashMap<>();
                for (var entry : counter.entrySet()) {
                    if (entry.getValue() > 1) {
                        newCounter.put(entry.getKey(), entry.getValue() - 1);
                    }
                }
                counter = newCounter;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(var key : counter.keySet()) {
            int freq = 0;
            for (var num : nums) {
                freq += (num == key) ? 1 : 0;
            }
            if (freq > nums.length / 3) {
                result.add(key);
            }
        }
        return result;
    }
}