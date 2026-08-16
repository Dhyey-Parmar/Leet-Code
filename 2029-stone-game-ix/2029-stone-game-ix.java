class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a[] = new int[3];

        for (int i = 0; i < stones.length; i++) {
            a[stones[i] % 3]++;
        }

        if (a[1] == 0 && a[2] == 0) {
            return false;
        }

        if (a[0] % 2 == 0) {
            return a[1] > 0 && a[2] > 0;
        }

        return Math.abs(a[1] - a[2]) > 2;
    }
}