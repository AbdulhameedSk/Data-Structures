class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            ArrayList<Character> now = new ArrayList<>();
            for(int j=0;j<9;j++){
                if(now.contains(board[i][j])){
                    return false;
                }
                if(board[i][j]!='.'){
                now.add(board[i][j]);
                }
            }
        }
        
        for(int j=0;j<9;j++){
            ArrayList<Character> now = new ArrayList<>();
            for(int i=0;i<9;i++){
                if(now.contains(board[i][j])){
                    return false;
                }
                                if(board[i][j]!='.'){

                now.add(board[i][j]);
                                }
            }
        }
        
for (int i = 0; i < 9; i += 3) {
    for (int j = 0; j < 9; j += 3) {
        ArrayList<Character> al = new ArrayList<>();
        for (int l = i; l < i + 3; l++) {
            for (int m = j; m < j + 3; m++) {
                if (board[l][m] != '.') {
                    if (al.contains(board[l][m])) {
                        return false;
                    }
                    al.add(board[l][m]);
                }
            }
        }
    }
}

        
        return true;
    }
}