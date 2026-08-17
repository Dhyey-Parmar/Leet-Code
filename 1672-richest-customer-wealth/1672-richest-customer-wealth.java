class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0,max=0;
        for(int i=0;i<accounts.length;i++){
            wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth +=accounts[i][j];
            }    
            max=Math.max(wealth,max);
        }
        return max;
    }
}