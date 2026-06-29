class Solution {
    public int[] twoSum(int[] nums, int target) {
     int temp=0;
     int ans[]=new int[2];
     for(int i=0;i<nums.length;i++){
        temp = target - nums[i];;
        ans[0]=i;
        for(int j=i+1;j<nums.length;j++){
            if(temp==nums[j]) {
                ans[1]=j;
                return ans;
            }
        }
     }  
     return new int[]{};
    }
}