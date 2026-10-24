class Solution {
    public int[] getDay(String s) {
        int[] ans = new int[2];
        ans[0] = Integer.parseInt(s.substring(0, 2));
        ans[1] = Integer.parseInt(s.substring(3, 5));
        return ans;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int[] arr = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};

        int aliceStart = getDayNumber(arriveAlice, arr);
        int aliceEnd = getDayNumber(leaveAlice, arr);
        int bobStart = getDayNumber(arriveBob, arr);
        int bobEnd = getDayNumber(leaveBob, arr);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }

    public int getDayNumber(String s, int[] arr) {
        int[] date = getDay(s);
        int days = date[1];

        for (int i = 0; i < date[0] - 1; i++) {
            days += arr[i];
        }

        return days;
    }
}