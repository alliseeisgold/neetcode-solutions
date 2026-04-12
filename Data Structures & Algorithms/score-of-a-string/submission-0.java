class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 >= s.length()) {
                break;
            }
            int code1 = s.charAt(i) - 'a';
            int code2 = s.charAt(i + 1) - 'a';
            score += Math.abs(code1 - code2);
        }
        return score;
    }
}