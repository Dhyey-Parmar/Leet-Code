class Solution {
    public int minimumPushes(String word) {
        int strLen=word.length();
        if(strLen<=8) return strLen;
        if(strLen<=16) return 8+(strLen-8)*2;
        if(strLen<=24) return 24+(strLen-16)*3;
        
        return 48+(strLen-24)*4;
    }
}