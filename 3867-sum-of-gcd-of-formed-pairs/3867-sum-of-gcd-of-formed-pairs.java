class Solution {
    public int GCD(int a,int b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int mx=nums[0];
        int prefixGcd[]=new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=GCD(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum+=(long)GCD(prefixGcd[i],prefixGcd[n-i-1]);
        }
        return sum;
    }
}