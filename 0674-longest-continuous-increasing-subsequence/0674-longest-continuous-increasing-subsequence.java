class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int l=0,r=1;
        int count=1;
        while(r<nums.length){
            if(nums[r-1]>=nums[r]){
                count=Math.max(count,r-l);
                l=r;
                r=r+1;
            }else{
                r++;
            }
        }
        count=Math.max(count,r-l);
        return count;
    }
}