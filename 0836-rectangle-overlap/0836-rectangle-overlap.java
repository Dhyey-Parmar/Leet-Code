class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int minX = Math.max(rec1[0], rec2[0]);
        int maxX = Math.min(rec1[2], rec2[2]);

        if (maxX - minX <= 0) {
            return false;
        }

        int minY = Math.max(rec1[1], rec2[1]);
        int maxY = Math.min(rec1[3], rec2[3]);

        if (maxY - minY <= 0) {
            return false;
        }

        return true;
    }
}