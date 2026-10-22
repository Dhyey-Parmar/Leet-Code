
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int suffixSum = nums[n - 1];
        int count = 0;

        for (int i = n - 2; i >= 0; i--) {
            int elementsRight = n - i - 1;

            if (nums[i] * elementsRight > suffixSum) {
                count++;
            }

            suffixSum += nums[i];
        }

        return count;
    }
}
