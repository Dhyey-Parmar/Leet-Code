
import java.util.Arrays;

class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        long ans = 1;
        int negatives = 0;

        for (int num : nums) {
            if (num < 0) {
                negatives++;
            }
        }

        int end = negatives;

        if (negatives % 2 != 0) {
            end--;
        }

        for (int i = 0; i < end; i++) {
            ans *= nums[i];
        }

        for (int i = negatives; i < n; i++) {
            if (nums[i] > 0) {
                ans *= nums[i];
            }
        }

        if (end == 0 && (negatives == 0 || negatives == 1)
                && nums[n - 1] == 0) {
            return 0;
        }

        return ans;
    }
}
