// ["ab", "ba", "cd", "cdb", "dc"] -> [["ab", "ba"], ["cd", "dc"], ["cdb"]]
// copy = ["ab", "ab", "cd", "bcd", "cd"]
// hashes = ["110000...", "110000...", "0011000...", "0011100...", "0011000..."]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        int[][] hashes = new int[n][26];
        for (int i = 0; i < n; i++) {
            hashes[i] = new int[26];
        }
        
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                hashes[i][strs[i].charAt(j) - 'a']++;
            }
            String hash = Arrays.toString(hashes[i]);
            map.putIfAbsent(hash, new ArrayList<>());
            map.get(hash).add(strs[i]);
        }
        List<List<String>> answer = new ArrayList<>();
        for (var values : map.values()) {
                answer.add(values);
        }
        return answer;
    }
}
