class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set <String> hset = new HashSet<>();
        
        for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                char num = board[i][j];
                
                if(num != '.') {  // i.e. check if it is a number
                    if(hset.contains(num + "at row" + i) ||
                      hset.contains(num + "at col" + j) ||
                      hset.contains(num + "at box" + i/3 + "-" + j/3)) {
                        return false;   
                    }
                      hset.add(num + "at row" + i);
                      hset.add(num + "at col" + j);
                      hset.add(num + "at box" + i/3 + "-" + j/3);
                }
            }
        }
        return true;
    }
}