class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,word=1;
        for(String s : sentences){
            word=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') word++;
            }
            if(word>max) max=word;
        }
        return max;
    }
}