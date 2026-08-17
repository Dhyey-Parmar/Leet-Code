class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = 0, s2 = 0;

        for (int i = 0; i < player1.length; i++) {
            if (i >= 1 && player1[i - 1] == 10 || i >= 2 && player1[i - 2] == 10) {
                s1 += 2 * player1[i];
            } else {
                s1 += player1[i];
            }

            if (i >= 1 && player2[i - 1] == 10 || i >= 2 && player2[i - 2] == 10) {
                s2 += 2 * player2[i];
            } else {
                s2 += player2[i];
            }
        }

        if (s1 > s2) {
            return 1;
        } else if (s2 > s1) {
            return 2;
        }

        return 0;
    }
}