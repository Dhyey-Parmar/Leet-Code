class Solution {
    public String longestCommonPrefix(String[] strs) {

        int ind = 0;

        for (int i = 0; i < strs.length; i++) {

            if (ind >= strs[0].length() || ind >= strs[i].length()) {
                break;
            }

            if (strs[0].charAt(ind) != strs[i].charAt(ind)) {
                break;
            }

            if (i == strs.length - 1) {
                i = 0;
                ind++;
            }
        }

        return strs[0].substring(0, ind);
    }
}