class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i + 1 < s.length(); i++) {
            score += Math.abs(s.charAt(i + 1) - s.charAt(i));
        }
        return score;
    }
}