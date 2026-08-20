class Solution {
    public boolean isInString(String checker,String s){
        String a=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(checker.indexOf(a.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        String[] ans=new String[words.length];
        int ind=0;
        Boolean a=false,b=false,c=false;
        for(int i=0;i<words.length;i++){
            a=isInString("qwertyuiop",words[i]);
            b=isInString("zxcvbnm",words[i]);
            c=isInString("asdfghjkl",words[i]);
        if(a||b||c){
            ans[ind++]=words[i];
        }
        }
        String fans[]=new String[ind];
        for(int i=0;i<ind;i++){
            fans[i]=ans[i];
        }
        return fans;
    }
}