class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
    HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<reservedSeats.length;i++){
            set.add(reservedSeats[i][0]);
        }
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            map.putIfAbsent(reservedSeats[i][0], new ArrayList<>());
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }
        int ans = (n - map.size()) * 2;
        for(int row : map.keySet()){
            ArrayList<Integer> seats = map.get(row);

            boolean left =
                    !seats.contains(2) &&
                    !seats.contains(3) &&
                    !seats.contains(4) &&
                    !seats.contains(5);

            boolean middle =
                    !seats.contains(4) &&
                    !seats.contains(5) &&
                    !seats.contains(6) &&
                    !seats.contains(7);

            boolean right =
                    !seats.contains(6) &&
                    !seats.contains(7) &&
                    !seats.contains(8) &&
                    !seats.contains(9);

            if (left && right) {
                ans += 2;
            } 
            else if (left || middle || right) {
                ans++;
            }
        }
        return ans; 
    }
}