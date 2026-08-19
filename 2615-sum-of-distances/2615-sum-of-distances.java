class Solution {
    public long[] distance(int[] nums) {

        long ans[] = new long[nums.length];

        HashMap<Integer, Long> sum = new HashMap<>();
        HashMap<Integer, Long> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long c = count.getOrDefault(nums[i], 0L);
            long s = sum.getOrDefault(nums[i], 0L);

            ans[i] += (long) i * c - s;

            count.put(nums[i], c + 1);
            sum.put(nums[i], s + i);
        }

        count.clear();
        sum.clear();

        for (int i = nums.length - 1; i >= 0; i--) {
            long c = count.getOrDefault(nums[i], 0L);
            long s = sum.getOrDefault(nums[i], 0L);

            ans[i] += s - (long) i * c;

            count.put(nums[i], c + 1);
            sum.put(nums[i], s + i);
        }

        return ans;
    }
}
