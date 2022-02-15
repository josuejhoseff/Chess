import Chess.ChessException;
import Chess.ChessMath;
import boardLayer.BoardException;

public class Program {

	public static void main(String[] args) throws BoardException, ChessException {
		
		
		ChessMath chessMath = new ChessMath();
		UI.printBoard(chessMath.getPieces());
	}

}
