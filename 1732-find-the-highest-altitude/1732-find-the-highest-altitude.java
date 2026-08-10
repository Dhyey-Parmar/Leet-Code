class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int height=0;
        for(int i=0;i<gain.length;i++){
            height=height+gain[i];
            highest=Math.max(highest,height);
        }
        return highest;
    }
}