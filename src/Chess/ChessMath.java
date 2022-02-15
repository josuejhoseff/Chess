package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardLayer.Board;
import boardLayer.BoardException;
import boardLayer.Position;

public class ChessMath {

	private Board board;

	public ChessMath() throws BoardException, ChessException {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() throws BoardException {

		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;

	}
	private void PlaceNewPiece(char column, int row, ChessPiece piece) throws BoardException, ChessException {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() throws BoardException, ChessException {
		PlaceNewPiece('b', 6 , new Rook(board, Color.WHITE));
		PlaceNewPiece('a', 4, new King(board, Color.BLACK));
		PlaceNewPiece('d', 4, new King(board, Color.WHITE));
	}
}
