import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMath;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardLayer.BoardException;

public class Program {

	public static void main(String[] args) throws BoardException, ChessException {

		Scanner sc = new Scanner(System.in);
		ChessMath chessMath = new ChessMath();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMath.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.redChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.redChessPosition(sc);

				ChessPiece capturedPiece = chessMath.performChessMove(source, target);
			} 
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

	}

}
