class Solution {
    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        int i = 1;

        while (i <= n) {
            sum2 += i;

            if (sum2 == sum - sum2 + i) {
                return i;
            }

            i++;
        }

        return -1;
    }
}