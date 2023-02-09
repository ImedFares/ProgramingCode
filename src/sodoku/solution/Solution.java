package sodoku.solution;
class Solution {
	private static final int GRID_SIZE = 9;
    public void solveSudoku(char[][] board) {	
    	
    	solveBoard(board);		
    }
     
    private  boolean solveBoard(char[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
          for (int column = 0; column < GRID_SIZE; column++) {
            if (board[row][column] == '.') {
              for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                if (isValidPosition(board, numberToTry, row, column)) {
                  board[row][column] = Character.forDigit(numberToTry, row);
                  
                  if (solveBoard(board)) {
                    return true;
                  }
                  else {
                    board[row][column] = '.';
                  }
                }
              }
              return false;
            }
          }
        }
        return true;
      }
    
    private boolean numberInRow(char[][] board, int number, int row)
    {

        for (int i = 0; i < 9; i++)
        {
            if ((int)board[row][i] == number)
                return true;
        }
        return false;
    }
    private boolean numberInCol(char[][] board, int number, int col)
    {
        
        for (int i = 0; i < 9; i++)
        {
            if ((int)board[i][col] == number)
                return true;
        }
        return false;
    }

    private boolean numberInBox(char[][] board, int number, int row, int col)
    {
        int localRow = row - row % 3;
        int localCol = col - col % 3;
        for (int i = localRow; i < localRow + 3; i++)
        {
            for (int j = localCol; j < localCol + 3; j++)
            {
                if ((int)board[i][j] == number)
                    return true;
            }
        }
        return false;
    }
    
    private boolean isValidPosition(char[][] board, int number, int row, int col) {
        return !numberInRow(board, number, row) && !numberInCol(board, number, col) && !numberInBox(board, number, row, col);
    }
    
    public void printBoard(char[][] board) {
        for (int row = 0; row < 9; row++)
        {
        	if(row>0 && row%3 ==0)
        		System.out.println("-----------");
            for (int col = 0; col < 9; col++)
            {
            	if(col>0 && col%3 ==0)
            		System.out.print("!");
                System.out.print((int)board[row][col]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Solution s = new Solution();
        char[][] board= {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
        s.solveSudoku(board);
        //s.solveSudoku(board);
        s.printBoard(board);
    }
}