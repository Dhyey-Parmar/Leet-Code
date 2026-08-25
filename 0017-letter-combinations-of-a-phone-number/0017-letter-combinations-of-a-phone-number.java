class Solution {
    static String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> li=new ArrayList<>();
    public void rec(int i,String digits,StringBuilder ans){
        if(i>=digits.length()){
            li.add(ans.toString());
            return ;
        }
        for(int j=0;j<str[digits.charAt(i)-'0'].length();j++){
            ans.append(str[digits.charAt(i)-'0'].charAt(j));
            rec(i+1,digits,ans);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
            rec(0,digits,new StringBuilder());
            return li;
    }
}