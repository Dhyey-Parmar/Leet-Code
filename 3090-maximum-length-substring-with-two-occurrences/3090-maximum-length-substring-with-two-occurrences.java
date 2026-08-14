class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,right=0,ans=0;
        for(right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0) + 1);
        
        while(map.get(s.charAt(right)) > 2){
            char ch = s.charAt(left);
            map.put(ch, map.get(ch) - 1);
            left++;
        }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}