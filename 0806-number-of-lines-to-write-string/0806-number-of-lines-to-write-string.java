class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int pix = 0;
        int line = 1;

        for (int i = 0; i < s.length(); i++) {

            int width = widths[s.charAt(i) - 'a'];

            if (pix + width > 100) {
                line++;
                pix = width;
            } else {
                pix += width;
            }
        }

        return new int[]{line, pix};
    }
}