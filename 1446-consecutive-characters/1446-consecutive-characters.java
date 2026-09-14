class Solution {
    public int maxPower(String s) {
        int count=1,temp=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                count=Math.max(count,temp);
                temp=1;
            }else{
            temp++;}
        }
        count=Math.max(count,temp);
        return count;
    }
}