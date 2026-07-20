class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        int total = m*n;
        k = k%total;

        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < m; j++){
                row.add(0);
            }
            ans.add(row);
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int oldindex = i*m + j;
                int newindex = (oldindex + k)%total;
                int newrow = newindex/m;
                int newcol = newindex%m;

                ans.get(newrow).set(newcol, grid[i][j]);
            }
        }

        return ans;
    }
}