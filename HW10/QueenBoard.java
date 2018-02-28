//Stefan Tan
//APCS2 pd1
//HW10 -- [Freddie Mercury, Brian May, Roger Taylor, John Deacon] x n
//2018-02-27

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 */

public class QueenBoard
{
    private int[][] _board;
    
    public QueenBoard( int size ) 
    {
	_board = new int[size][size];
    }

  
    /***
     * precondition: board is filled with 0's only.
     * postcondition: 
     * If a solution is found, board shows position of N queens, 
     * returns true.
     * If no solution, board is filled with 0's, 
     * returns false.
     */
    public boolean solve()
    {
	if(solveH(0)){
	    printSolution();
	    return true;
	}
	System.out.println(this);
	return false;
    }

  
    /**
     *Helper method for solve. 
     */
    private boolean solveH( int col ) 
    {
	if(col == _board[0].length) return true;
	for(int i = 0; i < _board.length; i++){
	    if(addQueen(i,col)){
		if(solveH(col + 1)){
		    return true;
		}
		removeQueen(i,col);
	    }
	}
	return false;
    }

	

    public void printSolution()
    {
	/** Print board, a la toString...
	    Except:
	    all negs and 0's replaced with underscore
	    all 1's replaced with 'Q'
	*/
	String[][] solBoard = new String[_board.length][_board.length];
	for (int r = 0; r < _board.length; r++){
	    for (int c = 0; c < _board[r].length; c++){
		if (_board[r][c] <= 0){
		    solBoard[r][c] = "_";
		}
		if (_board[r][c] == 1){
		    solBoard[r][c] = "Q";
		}
	    }
	}
	String ans = "";
	for( int r = 0; r < solBoard.length; r++ ) {
	    for( int c = 0; c < solBoard[0].length; c++ ) {
		ans += solBoard[r][c]+"\t";
	    }
	    ans += "\n";
	}
	System.out.println(ans);
    }



    //================= YE OLDE SEPARATOR =================

    /***
     * Returns boolean if queen can be placed at the specified row and column
     * precondition: the board is intialized
     * postcondition: 
     If queen is placed then return true and marks location where another queen
     can't be placed. 
     If queen can not be placed then return false. 
    */
    private boolean addQueen(int row, int col){
	if(_board[row][col] != 0){
	    return false;
	}
	_board[row][col] = 1;
	int offset = 1;
	while(col+offset < _board[row].length){
	    _board[row][col+offset]--;
	    if(row - offset >= 0){
		_board[row-offset][col+offset]--;
	    }
	    if(row + offset < _board.length){
		_board[row+offset][col+offset]--;
	    }
	    offset++;
	}
	return true;
    }


    /***
     * Returns boolean if queen can be removed at specified row and column 
     * precondition: the board is intialized 
     * postcondition:
     If queen is at the specified row and col then remove it and clears off the 
     marks and return true.
     If queen is not at the specified row and col then return false.  
    */
    private boolean removeQueen(int row, int col){
	if ( _board[row][col] != 1 ) {
	    return false;
	}
	_board[row][col] = 0;
	int offset = 1;

	while( col+offset < _board[row].length ) {
	    _board[row][col+offset]++;
	    if( row - offset >= 0 ) {
		_board[row-offset][col+offset]++;
	    }
	    if( row + offset < _board.length ) {
		_board[row+offset][col+offset]++;
	    }
	    offset++;
	}
	return true;
    }


    /***
     * String output of the 2D array
     * precondition: board is intialized 
     * postcondition: returns a string representation of the 2D array
     */
    public String  toString() 
    {
	String ans = "";
	for( int r = 0; r < _board.length; r++ ) {
	    for( int c = 0; c < _board[0].length; c++ ) {
		ans += _board[r][c]+"\t";
	    }
	    ans += "\n";
	}
	return ans;
    }


    //main method for testing...
    public static void main( String[] args )
    {
	QueenBoard b = new QueenBoard(5);
	/*	System.out.println(b);
		b.addQueen(3,0);
		b.addQueen(0,1);
		System.out.println(b);
		b.removeQueen(3,0);
		System.out.println(b);
	*/
	b.solve();
    }
    
}//end class
