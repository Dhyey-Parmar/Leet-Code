class Solution {
    public int numberOfSpecialChars(String word) {
        int chLower[]=new int[26];
        int chUpper[]=new int[26];
        char ch;
        int count=0;
        for(int i=0;i<word.length();i++){
            ch=word.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
            if(Character.isLowerCase(ch)){
                chLower[ch-'a']=1;
            }else{
                chUpper[ch-'A']=1;
            }}
        }
        for(int i=0;i<26;i++){
            if(chLower[i]==1&&chUpper[i]==1){
                count++;
            }
        }
        return count;
    }
}