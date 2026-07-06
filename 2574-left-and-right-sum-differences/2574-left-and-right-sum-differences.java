class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int[nums.length];
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=0;
            for(int j=0;j<i;j++){
                ans[i]+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                right+=nums[j];
            }   
            ans[i]=Math.abs(ans[i]-right);
        }
        return ans;
    }
}