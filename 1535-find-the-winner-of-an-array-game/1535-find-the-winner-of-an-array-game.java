class Solution {
    
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int currWinnings = 0;

        for (int i = 1; i < arr.length; i++) {
            if (winner > arr[i]) {
                currWinnings++;
            } else {
                winner = arr[i];
                currWinnings = 1;
            }

            if (currWinnings == k)
                return winner;
        }

        return winner;
    }
}