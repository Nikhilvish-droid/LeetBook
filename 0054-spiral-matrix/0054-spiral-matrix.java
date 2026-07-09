class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int up = 0, down = matrix.length-1, left = 0, right = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        while(left <= right && up <= down){
            for(int i = left; i <= right; i++){
                ans.add(matrix[up][i]);
            }
            up++;

            for(int i = up; i <= down; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(up <= down){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            if(left <= right){
                for(int i = down; i >= up; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}