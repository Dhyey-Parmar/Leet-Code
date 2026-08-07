class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp=a;
        int count=1;
        while (a.length() < b.length()) {
            a += temp;
            count++;
        }

        if (a.contains(b))
            return count;

        a += temp;
        count++;

        if (a.contains(b))
            return count;

        return -1;
    }
}