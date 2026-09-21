class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1,k=0;
        int[] arr=new int[nums.length];
        while(j<nums.length){
            arr[k++]=nums[j];
            arr[k++]=nums[i];
            i+=2;
            j+=2;
        }
        return arr;
    }
}