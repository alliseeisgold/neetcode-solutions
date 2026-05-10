class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int first = 0;
        int second = 0;
        while (first < lenWord1 || second < lenWord2) {
            if (first < lenWord1) {
                result.append(word1.charAt(first++));
            }
            if (second < lenWord2) {
                result.append(word2.charAt(second++));
            }
        }
        return result.toString();
    }
}