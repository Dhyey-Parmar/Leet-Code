class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int MOD = 1_000_000_007;

        long[] preValue = new long[n + 1];
        int[] preSum = new int[n + 1];
        int[] preCount = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            preSum[i + 1] = preSum[i];
            preCount[i + 1] = preCount[i];
            preValue[i + 1] = preValue[i];

            if (digit != 0) {
                preSum[i + 1] += digit;
                preCount[i + 1]++;
                preValue[i + 1] = (preValue[i] * 10 + digit) % MOD;
            }
        }

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int sum = preSum[r + 1] - preSum[l];
            int cnt = preCount[r + 1] - preCount[l];

            long value = (preValue[r + 1]
                    - (preValue[l] * pow10[cnt]) % MOD
                    + MOD) % MOD;

            ans[i] = (int) ((value * sum) % MOD);
        }

        return ans;
    }
}