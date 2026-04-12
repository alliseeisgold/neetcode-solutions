// approachs:
// brute force - O(n * m), O(1), n = len(s), m = len(t)
// optimal - O(m), O(1)
// s = "node", t = "neetcode"
// left = 0, right = 0

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }

        int left = 0;
        for (int right = 0; right < t.length(); right++) {
            if (left < s.length() && 
                    s.charAt(left) == t.charAt(right)) {
                left++;
            }
        }
        return left == s.length();
    }
}