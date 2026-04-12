// arr = [2, 3, 5, 3, 1, 2]
// brute force - [5, 5, 3, 2, 2, -1] - O(n^2), O(1)
// optimal - O(n), O(n)
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int currentMax = arr[n - 1];
        result[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            result[i] = currentMax;
            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
        }
        return result;
    }
}