class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=(nums.length-1);
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(nums.length==0) return ans;
        while((left<nums.length-1)&&right>0){
            if((nums[left]==target)&&(nums[right]==target)){break;}
            if(nums[left]==target){
            right--;    
            }else if(nums[right]==target){
            left++;
            }else{
            left++;
            right--;
            }
        }       
    if(nums[left]==target){
        ans[0]=left;
        ans[1]=right;
        return ans;
        }
        return ans;
    }
}