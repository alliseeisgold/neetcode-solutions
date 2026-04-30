// [2, 3, 4, 1, 0] -> [0, 0, 0, 0, 24]
// [-1, 2] -> [2, -1]
// [1, 4, 6, -1] -> [-24, -6, -4, 24]
// prefixProduct: [1,     4,  24, -24]
// suffixProduct: [-24, -24,  -6,  -1]
// output:        [-24,  -6,   4,  24]

// approachs:
// 1. brute force
// two nested loops: outer loop iterates through the array and in inner loop we 
// also iterate through the array and count the product skipping the current element
// TC: O(n^2), SC: O(1) if we don't count an output array as extra space, otherwise O(n), n = len(nums)

// 2. optimizing with extra space:
// we create two arrays: prefixProduct that stores the prefix product of the nums array and 
// suffixProduct that stores the suffix product of the nums array. 
// we use this arrays to fill output array in such way. Let's assume that we want to find 
// product for i-position:
// - if i == 0 then output[i] = suffixProduct[i + 1]
// - else if i == n - 1 then output[i] = prefixProduct[i - 1]
// - else output[i] = prefixProduct[i - 1] * suffixProduct[i + 1]
// TC: O(n), SC: O(n)

// 3. optimizing without extra space:
//

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        output[0] = nums[0];
        for (int i = 1; i < n; i++) {
            output[i] = nums[i] * output[i - 1];
        }
        int suffix = nums[n - 1];
        output[n - 1] = output[n - 2];
        for (int i = n - 2; i > 0; i--) {
            output[i] = suffix * output[i - 1];
            suffix *= nums[i];
        }
        output[0] = suffix;
        return output;
    }
}  
