class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> counter = new HashMap<>();
        int l = 0;
        int result = 0;
        for (int r = 0; r < n; r++) {
            char cur = s.charAt(r);
            counter.put(cur, counter.getOrDefault(cur, 0) + 1);
            while (counter.get(cur) > 1) {
                char left = s.charAt(l);
                counter.put(left, counter.get(left) - 1);
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}

// zxyzwxyz
//     l  r
