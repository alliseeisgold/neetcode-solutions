class Solution {

    static void merge(int nums[], int l, int mid, int r) {
        int n = mid - l + 1;
        int m = r - mid;

        int[] left = new int[n];
        int[] right = new int[m];
        for (int i = 0; i < n; i++) {
            left[i] = nums[l + i];
        }
    
        for (int j = 0; j < m; j++) {
            right[j] = nums[mid + 1 + j]; 
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n || j < m) {
            if (i >= n) {
                nums[k++] = right[j++];
            } else if (j >= m) {
                nums[k++] = left[i++];
            } else {
                if (left[i] < right[j]) {
                    nums[k++] = left[i++];
                } else {
                    nums[k++] = right[j++];
                }
            }
        }
    }

    static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}