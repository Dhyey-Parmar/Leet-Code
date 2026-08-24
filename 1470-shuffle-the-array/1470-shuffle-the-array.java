class Solution {
    public int[] shuffle(int[] nums, int n) {
        int var=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<(nums.length/2);i++){
            ans[var]=nums[i];
            var+=2;
        }
        var=1;
        for(int i=nums.length/2;i<nums.length;i++){
            ans[var]=nums[i];
            var+=2;
        }
        return ans;
    }
}