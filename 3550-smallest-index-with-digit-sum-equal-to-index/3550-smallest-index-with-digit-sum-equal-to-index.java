class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(temp==0 && i==0){
                return 0;
            }
            int sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            if(i==sum){
                return i;
            }
        }
        return -1;
    }
}