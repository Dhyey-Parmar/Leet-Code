class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[2];
        int ind = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                arr[ind++] = nums[i];
                i--;
            }
        }

        if (ind < 2) {
            arr[ind] = nums[nums.length - 1];
        }

        return arr;
    }
}