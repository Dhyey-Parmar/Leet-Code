class Solution {
    public boolean checkRecord(String s) {
        int A=0,L=0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                A++;
                L = 0;
                if (A >= 2)
                    return false;

            } else if (s.charAt(i) == 'L') {
                L++;

                if (L >= 3)
                    return false;

            } else {
                L = 0;
            }
        }

        return true;
    }
}