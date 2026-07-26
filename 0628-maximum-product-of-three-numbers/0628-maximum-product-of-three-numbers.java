class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else if (i > third) {
                third = i;
            }

            if (i < small1) {
                small2 = small1;
                small1 = i;
            } else if (i < small2) {
                small2 = i;
            }
        }

        return Math.max(first * second * third, small1 * small2 * first);
}
}