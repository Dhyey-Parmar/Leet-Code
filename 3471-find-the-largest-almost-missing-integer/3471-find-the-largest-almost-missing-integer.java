class Solution {
    public static int getlargest(int[] nums){
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=0;i--){
        int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1) return nums[i];    
        }
        return -1;
    }
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==1) return getlargest(nums);
        if(k==n) {
            Arrays.sort(nums);
            return nums[n-1];
        } 
        int occ1=0,occn=0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[0]) occ1++;
            if(nums[i]==nums[n-1]) occn++;
        }
        if(occ1>1&&occn>1) return -1;
        if(occ1>occn){
            return nums[n-1];
        }
        if(occ1<occn){
            return nums[0];
        }
        return Math.max(nums[0],nums[n-1]);        
    }
}