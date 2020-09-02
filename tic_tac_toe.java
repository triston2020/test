public class TicTacToe {
    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;

    // init, n will be the size of board
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
    }

    /**
        Player makes a move at (row, col)
        @param row: the row of board
        @param col: the column of board
        @param player: player 1 or 2
        @return
                0: no wins
                1: player 1 wins
                2: player 2 wins
    **/
    public int move(int row, int col, int player) {
        int toAdd = player == 1 ? 1 : -1;
    
        rows[row] += toAdd;
        cols[col] += toAdd;
        if (row == col)
        {
            diagonal += toAdd;
        }
        
        if (col == (cols.length - row - 1))
        {
            antiDiagonal += toAdd;
        }
        
        int size = rows.length;
        if (Math.abs(rows[row]) == size ||
            Math.abs(cols[col]) == size ||
            Math.abs(diagonal) == size  ||
            Math.abs(antiDiagonal) == size)
        {
            return player;
        }
        
        return 0;
    }
}