class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
        }

        int size = list.size();
        k = k % size; 

        for (int i = 0; i < k; i++) {
            int last = list.get(size - 1);

            for (int j = size - 1; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }

            list.set(0, last);
        }

        
        List<List<Integer>> ans = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {
                row.add(list.get(index++));
            }

            ans.add(row);
        }

        return ans;
    }
}