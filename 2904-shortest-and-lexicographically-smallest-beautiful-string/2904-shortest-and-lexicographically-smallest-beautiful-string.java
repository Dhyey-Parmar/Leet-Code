class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int count=0;
        int min=s.length()+1;
        String ans="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1') count++;
            while(count==k){
                while(s.charAt(left)=='0') left++;
                int len=right-left+1;
                String temp = s.substring(left, right + 1);

                if(len < min){
                    min = len;
                    ans = temp;
                }
                else if(len == min && temp.compareTo(ans) < 0){
                    ans = temp;
                }

                left++;
                count--;
            }
        }
        return ans;
    }
}