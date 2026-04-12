// maximum length of the lcp = length of the shortest string in the array 
// ["bat", "bag", "bank", "band"] -> "ba"
// ["neet","feet"] -> ""

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        boolean found = false;
        for (i = 0; i < strs[0].length(); i++) {
            char candidate = strs[0].charAt(i);
            for (String str :  strs) {
                if (i == str.length() || candidate != str.charAt(i)) {
                   found = true;
                   break;
                }
            }
            if (found) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}