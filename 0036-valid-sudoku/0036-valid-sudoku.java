class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int row = 0; row < 9; row++){

            for(int col = 0; col < 9; col++){
                if(board[row][col] != '.'){

                    int boxno = (row/3)*3 + col/3;
                    if( rows[row].contains(board[row][col]) || cols[col].contains(board[row][col]) || boxes[boxno].contains(board[row][col]) ){
                        return false;
                    } 
                    else{
                        rows[row].add(board[row][col]);
                        cols[col].add(board[row][col]);
                        boxes[boxno].add(board[row][col]);
                    }

                }
            }
        }
        return true;
    }
}