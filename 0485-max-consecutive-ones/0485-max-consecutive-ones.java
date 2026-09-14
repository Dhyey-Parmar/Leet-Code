class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1) {
                count=Math.max(count,temp);
                temp=0;
            }else temp++;
        }
        count=Math.max(count,temp);

        return count;
    }
}