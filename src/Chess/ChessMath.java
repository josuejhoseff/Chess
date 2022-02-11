package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardLayer.Board;
import boardLayer.BoardException;
import boardLayer.Position;

public class ChessMath {

	private Board board;

	public ChessMath() throws BoardException {
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
	
	public void initialSetup() throws BoardException {
		board.placePiece(new Rook(board, Color.WHITE), new Position(5, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
