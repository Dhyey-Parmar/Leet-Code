class Solution {
    public static boolean contain(int[]nums,int sum){
        for(int i=0;i<nums.length;i++){
            if(sum==nums[i]) return true;
        }
        return false;
    }
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        while(contain(nums,sum)){
            sum++;
        }
        return sum;
    }
}