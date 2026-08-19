class Solution {
    public long[] getDistances(int[] arr) {
        long ans[] = new long[arr.length];

        HashMap<Integer, Long> sum = new HashMap<>();
        HashMap<Integer, Long> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            long c = count.getOrDefault(arr[i], 0L);
            long s = sum.getOrDefault(arr[i], 0L);

            ans[i] += (long) i * c - s;

            count.put(arr[i], c + 1);
            sum.put(arr[i], s + i);
        }

        count.clear();
        sum.clear();

        for (int i = arr.length - 1; i >= 0; i--) {
            long c = count.getOrDefault(arr[i], 0L);
            long s = sum.getOrDefault(arr[i], 0L);

            ans[i] += s - (long) i * c;

            count.put(arr[i], c + 1);
            sum.put(arr[i], s + i);
        }

        return ans;
    }
}