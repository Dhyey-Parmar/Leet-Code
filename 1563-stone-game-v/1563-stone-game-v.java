class Solution {
    int[][] dp;
    int[] sum;

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;

        dp = new int[n][n];
        sum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + stoneValue[i];
        }

        return solve(stoneValue, 0, n - 1);
    }

    public int solve(int[] stoneValue, int left, int right) {
        if (left == right) {
            return 0;
        }

        if (dp[left][right] != 0) {
            return dp[left][right];
        }

        int ans = 0;

        for (int i = left; i < right; i++) {
            int lsum = sum[i + 1] - sum[left];
            int rsum = sum[right + 1] - sum[i + 1];

            if (lsum < rsum) {
                ans = Math.max(ans, lsum + solve(stoneValue, left, i));
            } else if (rsum < lsum) {
                ans = Math.max(ans, rsum + solve(stoneValue, i + 1, right));
            } else {
                ans = Math.max(ans,
                        lsum + Math.max(
                                solve(stoneValue, left, i),
                                solve(stoneValue, i + 1, right)
                        ));
            }
        }

        dp[left][right] = ans;
        return ans;
    }
}