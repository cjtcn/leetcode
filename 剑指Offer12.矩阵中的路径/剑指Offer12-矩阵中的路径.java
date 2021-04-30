class Solution {
    public boolean exist(char[][] board, String word) {
        char [] words = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int k){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]) return false;
        if(k == words.length - 1) return true;
        char temp = board[i][j];
        board[i][j] = '\0';
        int[] dx = new int[] {1,-1,0,0};
        int[] dy = new int[] {0,0,1,-1};
        for(int p = 0; p < 4;p++){
            int m = i + dx[p];
            int n = j + dy[p];
            if(dfs(board,words,m,n,k + 1)){
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }
}