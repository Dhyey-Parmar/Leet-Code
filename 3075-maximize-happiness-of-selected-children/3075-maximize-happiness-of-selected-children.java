class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int arrind=happiness.length-1,neg=0;
        long ans=0;
        for(int i=0;i<k;i++){
            if(happiness[arrind]-neg<=0){
                return ans;
            }
            ans+=happiness[arrind--]-neg;
            neg++;
        }
        return ans;
    }
}