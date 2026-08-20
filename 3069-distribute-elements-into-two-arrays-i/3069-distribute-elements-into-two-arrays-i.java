class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int i1=0,i2=0;
        arr1[i1++]=nums[0];
        arr2[i2++]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr1[i1-1]>arr2[i2-1]){
                arr1[i1++]=nums[i];
            }else{
                arr2[i2++]=nums[i];
            }
        }
        
        int i=0;
        for(int j=0;j<i1;j++){
            nums[i++]=arr1[j];
        }
        for(int j=0;j<i2;j++){
            nums[i++]=arr2[j];
        }
    return nums;
    }
}