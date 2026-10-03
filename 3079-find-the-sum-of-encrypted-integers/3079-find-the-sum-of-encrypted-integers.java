class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int max = 0;
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                max = Math.max(max, digit);
                digits++;
                temp /= 10;
            }

            int encrypted = 0;

            for (int i = 0; i < digits; i++) {
                encrypted = encrypted * 10 + max;
            }

            ans += encrypted;
        }

        return ans;
    }
}