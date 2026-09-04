class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            for(int t=i;t<nums.length;t++){
                
                if(nums[t]<min){
                    min=nums[t];
                }   
            }
            if((max-min)<=k){
                return i;
            }
        }
        return -1;
    }
}