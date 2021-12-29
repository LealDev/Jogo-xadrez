package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Application {
	
	public static void main(String [] args) {
		Scanner ent = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(ent);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(ent);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}
