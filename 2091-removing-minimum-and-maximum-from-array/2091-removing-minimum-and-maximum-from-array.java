class Solution {
    public int minimumDeletions(int[] nums) {
        int minInd=0,maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[minInd]>nums[i]){
                minInd=i;
            }
            if(nums[maxInd]<nums[i]){
                maxInd=i;
            }
        }

        int left = Math.max(minInd, maxInd) + 1;

        int right = nums.length - Math.min(minInd, maxInd);

        int both = Math.min(minInd, maxInd) + 1+ nums.length - Math.max(minInd, maxInd);

        return Math.min(left, Math.min(right, both));
    }
}