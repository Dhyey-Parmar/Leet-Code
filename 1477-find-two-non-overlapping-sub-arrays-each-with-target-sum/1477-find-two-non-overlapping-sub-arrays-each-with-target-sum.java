class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int max1 = n + 1;

        int[] best = new int[n];

        for (int i = 0; i < n; i++) {
            best[i] = max1;
        }

        int left = 0;
        int sum = 0;
        int ans = max1;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left++];
            }

            if (sum == target) {
                int len = right - left + 1;

                if (left > 0 && best[left - 1] != max1) {
                    ans = Math.min(ans, len + best[left - 1]);
                }

                best[right] = Math.min(
                    right > 0 ? best[right - 1] : max1,
                    len
                );
            } else {
                best[right] = right > 0 ? best[right - 1] : max1;
            }
        }

        return ans == max1 ? -1 : ans;
    }
}