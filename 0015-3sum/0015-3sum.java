class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li=new ArrayList<>();
        int left=0,right=0;

        for(int i=0;i<nums.length;i++){
            left=i+1;
            right=nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > 0){
                break;
            }

            while(left<right){

                if(nums[i]==-(nums[left]+nums[right])){

                    List<Integer> li1=new ArrayList<>();
                    li1.add(nums[i]);
                    li1.add(nums[left]);
                    li1.add(nums[right]);
                    li.add(li1);

                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }

                }else if((nums[left]+nums[right]) < -nums[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return li;
    }
}