class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rc=0,lc=0,sc=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R') rc++;
            else if(moves.charAt(i)=='L') lc++;
            else sc++;
        }
        return (Math.abs(rc-lc)+sc);
    }
}