// maximum length of the lcp = length of the shortest string in the array 
// ["bat", "bag", "bank", "band"] -> "ba"
// ["neet","feet"] -> ""

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minLen = strs[0].length();
        String shortestStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (minLen > strs[i].length()) {
                minLen = strs[i].length();
                shortestStr = strs[i];
            }
        }
        int i = 0;
        boolean found = false;
        for (i = 0; i < minLen; i++) {
            char candidate = shortestStr.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (candidate != strs[j].charAt(i)) {
                   found = true;
                   break;
                }
            }
            if (found) {
                break;
            }
        }
        return shortestStr.substring(0, i);
    }
}