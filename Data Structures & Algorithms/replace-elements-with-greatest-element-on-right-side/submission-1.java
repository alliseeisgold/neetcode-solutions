// arr = [2, 3, 5, 3, 1, 2]
// brute force - [5, 5, 3, 2, 2, -1] - O(n^2), O(1)
// optimal - O(n), O(1)
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int currentMax = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (currentMax < arr[i]) {
                int tmp = arr[i];
                arr[i] = currentMax;
                currentMax = tmp;
            } else {
                arr[i] = currentMax;
            }
        }
        return arr;
    }
}